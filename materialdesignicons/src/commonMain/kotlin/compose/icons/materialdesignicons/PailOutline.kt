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

public val MaterialDesignIcons.PailOutline: ImageVector
    get() {
        if (_pailOutline != null) {
            return _pailOutline!!
        }
        _pailOutline = Builder(name = "PailOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 7.63f)
                curveTo(11.97f, 7.35f, 12.58f, 7.5f, 12.86f, 8.0f)
                curveTo(13.14f, 8.47f, 12.97f, 9.09f, 12.5f, 9.36f)
                lineTo(4.27f, 14.11f)
                curveTo(3.79f, 14.39f, 3.18f, 14.23f, 2.9f, 13.75f)
                reflectiveCurveTo(2.79f, 12.66f, 3.27f, 12.38f)
                lineTo(11.5f, 7.63f)
                moveTo(3.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                lineTo(4.65f, 9.27f)
                lineTo(6.5f, 8.22f)
                lineTo(6.04f, 6.0f)
                horizontalLineTo(17.96f)
                lineTo(15.36f, 19.0f)
                horizontalLineTo(8.64f)
                lineTo(7.73f, 14.43f)
                lineTo(5.9f, 15.5f)
                lineTo(7.0f, 21.0f)
                horizontalLineTo(17.0f)
                lineTo(20.0f, 6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _pailOutline!!
    }

private var _pailOutline: ImageVector? = null
