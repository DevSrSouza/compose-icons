package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.FloorLampTorchiereVariantOutline: ImageVector
    get() {
        if (_floorLampTorchiereVariantOutline != null) {
            return _floorLampTorchiereVariantOutline!!
        }
        _floorLampTorchiereVariantOutline = Builder(name = "FloorLampTorchiereVariantOutline",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.97f, 4.0f)
                lineTo(12.68f, 7.0f)
                horizontalLineTo(11.32f)
                lineTo(10.03f, 4.0f)
                horizontalLineTo(13.97f)
                moveTo(17.0f, 2.0f)
                horizontalLineTo(7.0f)
                lineTo(10.0f, 9.0f)
                horizontalLineTo(14.0f)
                lineTo(17.0f, 2.0f)
                moveTo(15.92f, 22.0f)
                lineTo(13.0f, 15.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                lineTo(8.08f, 22.0f)
                horizontalLineTo(5.92f)
                lineTo(10.92f, 10.0f)
                horizontalLineTo(13.08f)
                lineTo(18.08f, 22.0f)
                horizontalLineTo(15.92f)
                close()
            }
        }
        .build()
        return _floorLampTorchiereVariantOutline!!
    }

private var _floorLampTorchiereVariantOutline: ImageVector? = null
