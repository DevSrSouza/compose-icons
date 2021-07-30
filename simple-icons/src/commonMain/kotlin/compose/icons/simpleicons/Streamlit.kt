package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Streamlit: ImageVector
    get() {
        if (_streamlit != null) {
            return _streamlit!!
        }
        _streamlit = Builder(name = "Streamlit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.673f, 11.32f)
                lineToRelative(6.862f, -3.618f)
                curveToRelative(0.233f, -0.136f, 0.554f, 0.12f, 0.442f, 0.387f)
                lineTo(20.463f, 17.1f)
                close()
                moveTo(8.117f, 11.091f)
                lineToRelative(3.473f, -5.187f)
                curveToRelative(0.203f, -0.328f, 0.578f, -0.316f, 0.793f, -0.028f)
                lineToRelative(7.886f, 11.75f)
                close()
                moveTo(4.742f, 18.341f)
                curveToRelative(-0.28f, 0.0f, -0.835f, -0.284f, -0.993f, -0.716f)
                lineToRelative(-3.72f, -9.46f)
                curveToRelative(-0.118f, -0.331f, 0.139f, -0.614f, 0.48f, -0.464f)
                lineToRelative(19.474f, 10.306f)
                curveToRelative(-0.149f, 0.147f, -0.453f, 0.337f, -0.72f, 0.334f)
                close()
            }
        }
        .build()
        return _streamlit!!
    }

private var _streamlit: ImageVector? = null
