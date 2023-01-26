package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Snowboarding: ImageVector
    get() {
        if (_snowboarding != null) {
            return _snowboarding!!
        }
        _snowboarding = Builder(name = "Snowboarding", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveTo(14.0f, 4.1f, 14.0f, 3.0f)
                close()
                moveTo(21.4f, 20.09f)
                curveToRelative(-0.23f, -0.05f, -0.46f, 0.02f, -0.64f, 0.17f)
                curveToRelative(-0.69f, 0.6f, -1.64f, 0.88f, -2.6f, 0.67f)
                lineTo(17.0f, 20.69f)
                lineToRelative(-1.0f, -6.19f)
                lineToRelative(-3.32f, -2.67f)
                lineToRelative(1.8f, -2.89f)
                curveTo(15.63f, 10.78f, 17.68f, 12.0f, 20.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-1.85f, 0.0f, -3.44f, -1.12f, -4.13f, -2.72f)
                lineToRelative(-0.52f, -1.21f)
                curveTo(15.16f, 5.64f, 14.61f, 5.0f, 13.7f, 5.0f)
                horizontalLineTo(8.0f)
                lineTo(5.5f, 9.0f)
                lineToRelative(1.7f, 1.06f)
                lineTo(9.1f, 7.0f)
                horizontalLineToRelative(2.35f)
                lineTo(8.5f, 11.7f)
                lineToRelative(1.0f, 4.3f)
                lineTo(6.0f, 18.35f)
                lineToRelative(-0.47f, -0.1f)
                curveToRelative(-0.96f, -0.2f, -1.71f, -0.85f, -2.1f, -1.67f)
                curveToRelative(-0.1f, -0.21f, -0.28f, -0.37f, -0.51f, -0.42f)
                curveToRelative(-0.43f, -0.09f, -0.82f, 0.2f, -0.9f, 0.58f)
                curveTo(1.98f, 16.88f, 2.0f, 17.05f, 2.07f, 17.2f)
                curveToRelative(0.58f, 1.24f, 1.71f, 2.2f, 3.15f, 2.51f)
                lineToRelative(12.63f, 2.69f)
                curveToRelative(1.44f, 0.31f, 2.86f, -0.11f, 3.9f, -1.01f)
                curveToRelative(0.13f, -0.11f, 0.21f, -0.26f, 0.24f, -0.41f)
                curveTo(22.06f, 20.6f, 21.83f, 20.18f, 21.4f, 20.09f)
                close()
                moveTo(8.73f, 18.93f)
                lineToRelative(3.02f, -2.03f)
                lineToRelative(-0.44f, -3.32f)
                lineToRelative(2.84f, 2.02f)
                lineToRelative(0.75f, 4.64f)
                lineTo(8.73f, 18.93f)
                close()
            }
        }
        .build()
        return _snowboarding!!
    }

private var _snowboarding: ImageVector? = null
