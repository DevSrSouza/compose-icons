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

public val BrandsGroup.Unity: ImageVector
    get() {
        if (_unity != null) {
            return _unity!!
        }
        _unity = Builder(name = "Unity", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.583f, 91.603f)
                lineTo(323.695f, 138.384f)
                curveTo(326.575f, 140.026f, 326.68f, 144.583f, 323.695f, 146.225f)
                lineTo(228.503f, 201.854f)
                curveTo(225.623f, 203.55f, 222.22f, 203.444f, 219.549f, 201.854f)
                lineTo(124.357f, 146.225f)
                curveTo(121.425f, 144.636f, 121.373f, 139.973f, 124.357f, 138.384f)
                lineTo(204.417f, 91.603f)
                verticalLineTo(0.0f)
                lineTo(0.0f, 119.417f)
                verticalLineTo(358.252f)
                lineTo(78.384f, 312.477f)
                verticalLineTo(218.914f)
                curveTo(78.332f, 215.576f, 82.207f, 213.192f, 85.087f, 214.993f)
                lineTo(180.279f, 270.622f)
                curveTo(183.159f, 272.318f, 184.782f, 275.338f, 184.782f, 278.464f)
                verticalLineTo(389.669f)
                curveTo(184.834f, 393.007f, 180.959f, 395.391f, 178.079f, 393.589f)
                lineTo(97.967f, 346.808f)
                lineTo(19.583f, 392.583f)
                lineTo(224.0f, 512.0f)
                lineTo(428.417f, 392.583f)
                lineTo(350.033f, 346.808f)
                lineTo(269.921f, 393.589f)
                curveTo(267.093f, 395.338f, 263.114f, 393.06f, 263.218f, 389.669f)
                verticalLineTo(278.464f)
                curveTo(263.218f, 275.126f, 265.051f, 272.159f, 267.721f, 270.622f)
                lineTo(362.914f, 214.993f)
                curveTo(365.741f, 213.245f, 369.72f, 215.47f, 369.616f, 218.914f)
                verticalLineTo(312.477f)
                lineTo(448.0f, 358.252f)
                verticalLineTo(119.417f)
                lineTo(243.583f, 0.0f)
                verticalLineTo(91.603f)
                close()
            }
        }
        .build()
        return _unity!!
    }

private var _unity: ImageVector? = null
