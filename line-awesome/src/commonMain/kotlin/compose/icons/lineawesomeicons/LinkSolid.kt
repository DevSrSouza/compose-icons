package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.LinkSolid: ImageVector
    get() {
        if (_linkSolid != null) {
            return _linkSolid!!
        }
        _linkSolid = Builder(name = "LinkSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.75f, 4.0f)
                curveTo(20.078f, 4.0f, 18.492f, 4.66f, 17.313f, 5.844f)
                lineTo(15.844f, 7.313f)
                curveTo(14.66f, 8.496f, 14.0f, 10.078f, 14.0f, 11.75f)
                curveTo(14.0f, 12.543f, 14.152f, 13.316f, 14.438f, 14.031f)
                lineTo(16.063f, 12.406f)
                curveTo(15.859f, 11.109f, 16.254f, 9.715f, 17.25f, 8.719f)
                lineTo(18.719f, 7.25f)
                curveTo(19.523f, 6.445f, 20.613f, 6.0f, 21.75f, 6.0f)
                curveTo(22.887f, 6.0f, 23.945f, 6.445f, 24.75f, 7.25f)
                curveTo(26.41f, 8.91f, 26.41f, 11.621f, 24.75f, 13.281f)
                lineTo(23.281f, 14.75f)
                curveTo(22.477f, 15.555f, 21.387f, 16.0f, 20.25f, 16.0f)
                curveTo(20.027f, 16.0f, 19.809f, 15.977f, 19.594f, 15.938f)
                lineTo(17.969f, 17.563f)
                curveTo(18.684f, 17.848f, 19.457f, 18.0f, 20.25f, 18.0f)
                curveTo(21.922f, 18.0f, 23.508f, 17.34f, 24.688f, 16.156f)
                lineTo(26.156f, 14.688f)
                curveTo(27.34f, 13.504f, 28.0f, 11.922f, 28.0f, 10.25f)
                curveTo(28.0f, 8.578f, 27.34f, 7.027f, 26.156f, 5.844f)
                curveTo(24.977f, 4.66f, 23.422f, 4.0f, 21.75f, 4.0f)
                close()
                moveTo(19.281f, 11.281f)
                lineTo(11.281f, 19.281f)
                lineTo(12.719f, 20.719f)
                lineTo(20.719f, 12.719f)
                close()
                moveTo(11.75f, 14.0f)
                curveTo(10.078f, 14.0f, 8.492f, 14.66f, 7.313f, 15.844f)
                lineTo(5.844f, 17.313f)
                curveTo(4.66f, 18.496f, 4.0f, 20.078f, 4.0f, 21.75f)
                curveTo(4.0f, 23.422f, 4.66f, 24.973f, 5.844f, 26.156f)
                curveTo(7.023f, 27.34f, 8.578f, 28.0f, 10.25f, 28.0f)
                curveTo(11.922f, 28.0f, 13.508f, 27.34f, 14.688f, 26.156f)
                lineTo(16.156f, 24.688f)
                curveTo(17.34f, 23.504f, 18.0f, 21.922f, 18.0f, 20.25f)
                curveTo(18.0f, 19.457f, 17.848f, 18.684f, 17.563f, 17.969f)
                lineTo(15.938f, 19.594f)
                curveTo(16.141f, 20.891f, 15.746f, 22.285f, 14.75f, 23.281f)
                lineTo(13.281f, 24.75f)
                curveTo(12.477f, 25.555f, 11.387f, 26.0f, 10.25f, 26.0f)
                curveTo(9.113f, 26.0f, 8.055f, 25.555f, 7.25f, 24.75f)
                curveTo(5.59f, 23.09f, 5.59f, 20.379f, 7.25f, 18.719f)
                lineTo(8.719f, 17.25f)
                curveTo(9.523f, 16.445f, 10.613f, 16.0f, 11.75f, 16.0f)
                curveTo(11.973f, 16.0f, 12.191f, 16.023f, 12.406f, 16.063f)
                lineTo(14.031f, 14.438f)
                curveTo(13.316f, 14.152f, 12.543f, 14.0f, 11.75f, 14.0f)
                close()
            }
        }
        .build()
        return _linkSolid!!
    }

private var _linkSolid: ImageVector? = null
