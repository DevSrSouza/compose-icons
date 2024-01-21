package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.SquareGitlab: ImageVector
    get() {
        if (_squareGitlab != null) {
            return _squareGitlab!!
        }
        _squareGitlab = Builder(name = "SquareGitlab", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(384.0f, 480.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(448.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                close()
                moveTo(337.5f, 108.5f)
                lineToRelative(44.6f, 116.4f)
                lineToRelative(0.4f, 1.2f)
                curveToRelative(5.6f, 16.8f, 7.2f, 35.2f, 2.3f, 52.5f)
                curveToRelative(-5.0f, 17.2f, -15.4f, 32.4f, -29.8f, 43.3f)
                lineToRelative(-0.2f, 0.1f)
                lineToRelative(-68.4f, 51.2f)
                lineToRelative(-54.1f, 40.9f)
                curveToRelative(-0.5f, 0.2f, -1.1f, 0.5f, -1.7f, 0.8f)
                curveToRelative(-2.0f, 1.0f, -4.4f, 2.0f, -6.7f, 2.0f)
                curveToRelative(-3.0f, 0.0f, -6.8f, -1.8f, -8.3f, -2.8f)
                lineToRelative(-54.2f, -40.9f)
                lineTo(93.5f, 322.3f)
                lineToRelative(-0.4f, -0.3f)
                lineToRelative(-0.2f, -0.1f)
                curveToRelative(-14.3f, -10.8f, -24.8f, -26.0f, -29.7f, -43.3f)
                reflectiveCurveToRelative(-4.2f, -35.7f, 2.2f, -52.5f)
                lineToRelative(0.5f, -1.2f)
                lineToRelative(44.7f, -116.4f)
                curveToRelative(0.9f, -2.3f, 2.5f, -4.3f, 4.5f, -5.6f)
                curveToRelative(1.6f, -1.0f, 3.4f, -1.6f, 5.2f, -1.8f)
                curveToRelative(1.3f, -0.7f, 2.1f, -0.4f, 3.4f, 0.1f)
                curveToRelative(0.6f, 0.2f, 1.2f, 0.5f, 2.0f, 0.7f)
                curveToRelative(1.0f, 0.4f, 1.6f, 0.9f, 2.4f, 1.5f)
                curveToRelative(0.6f, 0.4f, 1.2f, 1.0f, 2.1f, 1.5f)
                curveToRelative(1.2f, 1.4f, 2.2f, 3.0f, 2.7f, 4.8f)
                lineToRelative(29.2f, 92.2f)
                lineTo(285.0f, 201.9f)
                lineToRelative(30.2f, -92.2f)
                curveToRelative(0.5f, -1.8f, 1.4f, -3.4f, 2.6f, -4.8f)
                reflectiveCurveToRelative(2.8f, -2.4f, 4.5f, -3.1f)
                curveToRelative(1.7f, -0.6f, 3.6f, -0.9f, 5.4f, -0.7f)
                reflectiveCurveToRelative(3.6f, 0.8f, 5.2f, 1.8f)
                curveToRelative(2.0f, 1.3f, 3.7f, 3.3f, 4.6f, 5.6f)
                close()
            }
        }
        .build()
        return _squareGitlab!!
    }

private var _squareGitlab: ImageVector? = null
