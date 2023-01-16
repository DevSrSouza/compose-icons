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

public val MaterialDesignIcons.PhoneRing: ImageVector
    get() {
        if (_phoneRing != null) {
            return _phoneRing!!
        }
        _phoneRing = Builder(name = "PhoneRing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.71f, 16.67f)
                curveTo(20.66f, 13.78f, 16.54f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveTo(3.34f, 13.78f, 0.29f, 16.67f)
                curveToRelative(-0.18f, 0.18f, -0.29f, 0.43f, -0.29f, 0.71f)
                curveToRelative(0.0f, 0.28f, 0.11f, 0.53f, 0.29f, 0.71f)
                lineToRelative(2.48f, 2.48f)
                curveToRelative(0.18f, 0.18f, 0.43f, 0.29f, 0.71f, 0.29f)
                curveToRelative(0.27f, 0.0f, 0.52f, -0.11f, 0.7f, -0.28f)
                curveToRelative(0.79f, -0.74f, 1.69f, -1.36f, 2.66f, -1.85f)
                curveToRelative(0.33f, -0.16f, 0.56f, -0.5f, 0.56f, -0.9f)
                verticalLineToRelative(-3.1f)
                curveToRelative(1.45f, -0.48f, 3.0f, -0.73f, 4.6f, -0.73f)
                reflectiveCurveToRelative(3.15f, 0.25f, 4.6f, 0.72f)
                verticalLineToRelative(3.1f)
                curveToRelative(0.0f, 0.39f, 0.23f, 0.74f, 0.56f, 0.9f)
                curveToRelative(0.98f, 0.49f, 1.87f, 1.12f, 2.66f, 1.85f)
                curveToRelative(0.18f, 0.18f, 0.43f, 0.28f, 0.7f, 0.28f)
                curveToRelative(0.28f, 0.0f, 0.53f, -0.11f, 0.71f, -0.29f)
                lineToRelative(2.48f, -2.48f)
                curveToRelative(0.18f, -0.18f, 0.29f, -0.43f, 0.29f, -0.71f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, false, -0.29f, -0.7f)
                close()
                moveTo(21.16f, 6.26f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.56f, 3.55f)
                lineToRelative(1.41f, 1.41f)
                reflectiveCurveToRelative(3.45f, -3.52f, 3.56f, -3.55f)
                close()
                moveTo(13.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(6.4f, 9.81f)
                lineTo(7.81f, 8.4f)
                lineTo(4.26f, 4.84f)
                lineTo(2.84f, 6.26f)
                curveToRelative(0.11f, 0.03f, 3.56f, 3.55f, 3.56f, 3.55f)
                close()
            }
        }
        .build()
        return _phoneRing!!
    }

private var _phoneRing: ImageVector? = null
