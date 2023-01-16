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

public val MaterialDesignIcons.WrenchCheckOutline: ImageVector
    get() {
        if (_wrenchCheckOutline != null) {
            return _wrenchCheckOutline!!
        }
        _wrenchCheckOutline = Builder(name = "WrenchCheckOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 1.09f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(1.09f)
                curveTo(4.16f, 1.57f, 2.0f, 4.03f, 2.0f, 7.0f)
                curveTo(2.0f, 9.22f, 3.21f, 11.15f, 5.0f, 12.19f)
                verticalLineTo(21.0f)
                curveTo(5.0f, 21.55f, 5.45f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(10.55f, 22.0f, 11.0f, 21.55f, 11.0f, 21.0f)
                verticalLineTo(12.19f)
                curveTo(12.79f, 11.15f, 14.0f, 9.22f, 14.0f, 7.0f)
                curveTo(14.0f, 4.03f, 11.84f, 1.57f, 9.0f, 1.09f)
                moveTo(10.0f, 10.46f)
                lineTo(9.0f, 11.04f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.04f)
                lineTo(6.0f, 10.46f)
                curveTo(4.77f, 9.74f, 4.0f, 8.42f, 4.0f, 7.0f)
                curveTo(4.0f, 6.0f, 4.37f, 5.06f, 5.0f, 4.35f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.35f)
                curveTo(11.63f, 5.06f, 12.0f, 6.0f, 12.0f, 7.0f)
                curveTo(12.0f, 8.42f, 11.23f, 9.74f, 10.0f, 10.46f)
                moveTo(21.6f, 13.0f)
                lineTo(23.0f, 14.41f)
                lineTo(16.47f, 21.0f)
                lineTo(13.0f, 17.5f)
                lineTo(14.4f, 16.09f)
                lineTo(16.47f, 18.17f)
                lineTo(21.6f, 13.0f)
            }
        }
        .build()
        return _wrenchCheckOutline!!
    }

private var _wrenchCheckOutline: ImageVector? = null
