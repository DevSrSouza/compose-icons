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
                moveTo(48.0f, 32.0f)
                horizontalLineTo(400.0f)
                curveTo(426.5f, 32.0f, 448.0f, 53.5f, 448.0f, 80.0f)
                verticalLineTo(432.0f)
                curveTo(448.0f, 458.5f, 426.5f, 480.0f, 400.0f, 480.0f)
                horizontalLineTo(48.0f)
                curveTo(21.5f, 480.0f, 0.0f, 458.5f, 0.0f, 432.0f)
                verticalLineTo(80.0f)
                curveTo(0.0f, 53.5f, 21.5f, 32.0f, 48.0f, 32.0f)
                close()
                moveTo(382.1f, 224.9f)
                lineTo(337.5f, 108.5f)
                curveTo(336.6f, 106.2f, 334.9f, 104.2f, 332.9f, 102.9f)
                curveTo(331.3f, 101.9f, 329.5f, 101.3f, 327.7f, 101.1f)
                curveTo(325.9f, 100.9f, 324.0f, 101.2f, 322.3f, 101.8f)
                curveTo(320.6f, 102.5f, 319.0f, 103.5f, 317.8f, 104.9f)
                curveTo(316.6f, 106.3f, 315.7f, 107.9f, 315.2f, 109.7f)
                lineTo(285.0f, 201.9f)
                horizontalLineTo(162.1f)
                lineTo(132.9f, 109.7f)
                curveTo(132.4f, 107.9f, 131.4f, 106.3f, 130.2f, 104.9f)
                curveTo(128.1f, 103.6f, 127.4f, 102.5f, 125.7f, 101.9f)
                curveTo(123.1f, 101.2f, 122.1f, 100.1f, 120.3f, 101.1f)
                curveTo(118.5f, 101.3f, 116.7f, 101.9f, 115.1f, 102.9f)
                curveTo(113.1f, 104.2f, 111.5f, 106.2f, 110.6f, 108.5f)
                lineTo(65.94f, 224.9f)
                lineTo(65.47f, 226.1f)
                curveTo(59.05f, 242.9f, 58.26f, 261.3f, 63.22f, 278.6f)
                curveTo(68.18f, 295.9f, 78.62f, 311.1f, 92.97f, 321.9f)
                lineTo(93.14f, 322.0f)
                lineTo(93.52f, 322.3f)
                lineTo(161.4f, 373.2f)
                lineTo(215.6f, 414.1f)
                curveTo(217.1f, 415.1f, 220.9f, 416.9f, 223.9f, 416.9f)
                curveTo(226.9f, 416.9f, 229.9f, 415.1f, 232.3f, 414.1f)
                lineTo(286.4f, 373.2f)
                lineTo(354.8f, 322.0f)
                lineTo(355.0f, 321.9f)
                curveTo(369.4f, 311.0f, 379.8f, 295.8f, 384.8f, 278.6f)
                curveTo(389.7f, 261.3f, 388.1f, 242.9f, 382.5f, 226.1f)
                lineTo(382.1f, 224.9f)
                close()
            }
        }
        .build()
        return _squareGitlab!!
    }

private var _squareGitlab: ImageVector? = null
