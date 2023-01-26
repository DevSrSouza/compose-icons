package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.GTranslate: ImageVector
    get() {
        if (_gTranslate != null) {
            return _gTranslate!!
        }
        _gTranslate = Builder(name = "GTranslate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                horizontalLineToRelative(-9.12f)
                lineTo(10.0f, 2.0f)
                lineTo(4.0f, 2.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                lineToRelative(1.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(22.0f, 7.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(7.17f, 14.59f)
                curveToRelative(-2.25f, 0.0f, -4.09f, -1.83f, -4.09f, -4.09f)
                reflectiveCurveToRelative(1.83f, -4.09f, 4.09f, -4.09f)
                curveToRelative(1.04f, 0.0f, 1.99f, 0.37f, 2.74f, 1.07f)
                lineToRelative(0.07f, 0.06f)
                lineToRelative(-1.23f, 1.18f)
                lineToRelative(-0.06f, -0.05f)
                curveToRelative(-0.29f, -0.27f, -0.78f, -0.59f, -1.52f, -0.59f)
                curveToRelative(-1.31f, 0.0f, -2.38f, 1.09f, -2.38f, 2.42f)
                reflectiveCurveToRelative(1.07f, 2.42f, 2.38f, 2.42f)
                curveToRelative(1.37f, 0.0f, 1.96f, -0.87f, 2.12f, -1.46f)
                lineTo(7.08f, 11.46f)
                lineTo(7.08f, 9.91f)
                horizontalLineToRelative(3.95f)
                lineToRelative(0.01f, 0.07f)
                curveToRelative(0.04f, 0.21f, 0.05f, 0.4f, 0.05f, 0.61f)
                curveToRelative(0.0f, 2.35f, -1.61f, 4.0f, -3.92f, 4.0f)
                close()
                moveTo(13.2f, 12.88f)
                curveToRelative(0.33f, 0.6f, 0.74f, 1.18f, 1.19f, 1.7f)
                lineToRelative(-0.54f, 0.53f)
                lineToRelative(-0.65f, -2.23f)
                close()
                moveTo(13.97f, 12.12f)
                horizontalLineToRelative(-0.99f)
                lineToRelative(-0.31f, -1.04f)
                horizontalLineToRelative(3.99f)
                reflectiveCurveToRelative(-0.34f, 1.31f, -1.56f, 2.74f)
                curveToRelative(-0.52f, -0.62f, -0.89f, -1.23f, -1.13f, -1.7f)
                close()
                moveTo(21.0f, 20.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-7.0f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(-0.81f, -2.77f)
                lineToRelative(0.92f, -0.92f)
                lineTo(17.79f, 18.0f)
                lineToRelative(0.73f, -0.73f)
                lineToRelative(-2.71f, -2.68f)
                curveToRelative(0.9f, -1.03f, 1.6f, -2.25f, 1.92f, -3.51f)
                lineTo(19.0f, 11.08f)
                verticalLineToRelative(-1.04f)
                horizontalLineToRelative(-3.64f)
                lineTo(15.36f, 9.0f)
                horizontalLineToRelative(-1.04f)
                verticalLineToRelative(1.04f)
                horizontalLineToRelative(-1.96f)
                lineTo(11.18f, 6.0f)
                lineTo(20.0f, 6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(13.0f)
                close()
            }
        }
        .build()
        return _gTranslate!!
    }

private var _gTranslate: ImageVector? = null
