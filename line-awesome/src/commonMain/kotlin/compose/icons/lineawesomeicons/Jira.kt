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

public val LineAwesomeIcons.Jira: ImageVector
    get() {
        if (_jira != null) {
            return _jira!!
        }
        _jira = Builder(name = "Jira", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0215f, 2.1992f)
                lineTo(3.5801f, 14.6016f)
                curveTo(2.8111f, 15.3686f, 2.8091f, 16.6233f, 3.5801f, 17.4043f)
                lineTo(16.0215f, 29.8008f)
                lineTo(16.7285f, 29.0977f)
                curveTo(20.3675f, 25.4727f, 22.5942f, 23.2525f, 23.9102f, 21.9375f)
                lineTo(25.2656f, 20.5801f)
                curveTo(25.3426f, 20.5041f, 25.4287f, 20.4163f, 25.5137f, 20.3203f)
                curveTo(25.5497f, 20.2853f, 25.5778f, 20.2601f, 25.5918f, 20.2461f)
                lineTo(25.5859f, 20.2383f)
                curveTo(25.6069f, 20.2123f, 25.6274f, 20.1872f, 25.6484f, 20.1602f)
                curveTo(26.5794f, 19.2302f, 27.8501f, 17.9623f, 28.4121f, 17.4023f)
                curveTo(28.7911f, 17.0283f, 29.0f, 16.531f, 29.0f, 16.0f)
                curveTo(29.0f, 15.47f, 28.7921f, 14.9736f, 28.4141f, 14.5996f)
                curveTo(26.7511f, 12.9396f, 24.8342f, 11.017f, 22.9063f, 9.084f)
                curveTo(20.7463f, 6.918f, 18.5725f, 4.7383f, 16.7285f, 2.9023f)
                lineTo(16.0215f, 2.1992f)
                close()
                moveTo(16.0215f, 5.0234f)
                curveTo(17.7015f, 6.6994f, 19.6012f, 8.6031f, 21.4902f, 10.4961f)
                curveTo(23.4132f, 12.4241f, 25.3253f, 14.341f, 26.9863f, 15.998f)
                curveTo(25.6323f, 17.348f, 24.6784f, 18.3003f, 24.0254f, 18.9883f)
                curveTo(23.9014f, 19.1013f, 23.7745f, 19.2255f, 23.6445f, 19.3535f)
                curveTo(23.4205f, 19.5735f, 23.2013f, 19.786f, 23.1523f, 19.832f)
                lineTo(23.1699f, 19.8516f)
                curveTo(21.9309f, 21.0896f, 19.5634f, 23.4496f, 16.0234f, 26.9766f)
                lineTo(4.9922f, 16.0156f)
                lineTo(16.0215f, 5.0234f)
                close()
                moveTo(16.0215f, 10.9258f)
                lineTo(10.9277f, 16.0f)
                lineTo(16.0215f, 21.0742f)
                lineTo(21.1172f, 16.0f)
                lineTo(16.0215f, 10.9258f)
                close()
                moveTo(16.0215f, 13.748f)
                lineTo(18.2832f, 16.0f)
                lineTo(16.0215f, 18.252f)
                lineTo(13.7617f, 16.0f)
                lineTo(16.0215f, 13.748f)
                close()
            }
        }
        .build()
        return _jira!!
    }

private var _jira: ImageVector? = null
