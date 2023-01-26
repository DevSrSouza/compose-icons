package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.GTranslate: ImageVector
    get() {
        if (_gTranslate != null) {
            return _gTranslate!!
        }
        _gTranslate = Builder(name = "GTranslate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                lineTo(11.0f, 4.0f)
                lineToRelative(-1.0f, -3.0f)
                lineTo(3.0f, 1.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(1.0f, 3.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(23.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(7.0f, 16.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f)
                curveToRelative(1.35f, 0.0f, 2.48f, 0.5f, 3.35f, 1.3f)
                lineTo(9.03f, 8.57f)
                curveToRelative(-0.38f, -0.36f, -1.04f, -0.78f, -2.03f, -0.78f)
                curveToRelative(-1.74f, 0.0f, -3.15f, 1.44f, -3.15f, 3.21f)
                reflectiveCurveTo(5.26f, 14.21f, 7.0f, 14.21f)
                curveToRelative(2.01f, 0.0f, 2.84f, -1.44f, 2.92f, -2.41f)
                lineTo(7.0f, 11.8f)
                verticalLineToRelative(-1.71f)
                horizontalLineToRelative(4.68f)
                curveToRelative(0.07f, 0.31f, 0.12f, 0.61f, 0.12f, 1.02f)
                curveTo(11.8f, 13.97f, 9.89f, 16.0f, 7.0f, 16.0f)
                close()
                moveTo(13.17f, 10.58f)
                horizontalLineToRelative(3.7f)
                curveToRelative(-0.43f, 1.25f, -1.11f, 2.43f, -2.05f, 3.47f)
                curveToRelative(-0.31f, -0.35f, -0.6f, -0.72f, -0.86f, -1.1f)
                lineToRelative(-0.79f, -2.37f)
                close()
                moveTo(21.5f, 20.5f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(14.0f, 21.5f)
                lineToRelative(2.0f, -2.5f)
                lineToRelative(-1.04f, -3.1f)
                lineToRelative(3.1f, 3.1f)
                lineToRelative(0.92f, -0.92f)
                lineToRelative(-3.3f, -3.25f)
                lineToRelative(0.02f, -0.02f)
                curveToRelative(1.13f, -1.25f, 1.93f, -2.69f, 2.4f, -4.22f)
                lineTo(20.0f, 10.59f)
                verticalLineToRelative(-1.3f)
                horizontalLineToRelative(-4.53f)
                lineTo(15.47f, 8.0f)
                horizontalLineToRelative(-1.29f)
                verticalLineToRelative(1.29f)
                horizontalLineToRelative(-1.44f)
                lineTo(11.46f, 5.5f)
                horizontalLineToRelative(9.04f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _gTranslate!!
    }

private var _gTranslate: ImageVector? = null
