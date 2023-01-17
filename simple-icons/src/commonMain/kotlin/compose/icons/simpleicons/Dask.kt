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

public val SimpleIcons.Dask: ImageVector
    get() {
        if (_dask != null) {
            return _dask!!
        }
        _dask = Builder(name = "Dask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.023f, 17.416f)
                arcToRelative(14.223f, 14.223f, 0.0f, false, true, -4.027f, 1.195f)
                lineToRelative(-0.793f, 0.112f)
                lineToRelative(0.402f, -0.692f)
                arcToRelative(15.75f, 15.75f, 0.0f, false, false, 0.723f, -1.401f)
                arcToRelative(15.498f, 15.498f, 0.0f, false, false, 1.386f, -5.855f)
                lineToRelative(0.012f, -0.328f)
                lineToRelative(0.325f, -0.043f)
                arcToRelative(15.683f, 15.683f, 0.0f, false, false, 7.048f, -2.801f)
                arcToRelative(13.41f, 13.41f, 0.0f, false, false, 2.424f, -4.356f)
                arcTo(14.227f, 14.227f, 0.0f, false, true, 6.977f, 9.115f)
                lineToRelative(-0.663f, 0.046f)
                lineToRelative(0.014f, 0.666f)
                arcToRelative(14.08f, 14.08f, 0.0f, false, true, -1.268f, 6.228f)
                arcToRelative(14.276f, 14.276f, 0.0f, false, true, -1.805f, 2.958f)
                lineToRelative(-0.873f, 1.108f)
                lineToRelative(1.412f, 0.02f)
                arcToRelative(15.558f, 15.558f, 0.0f, false, false, 6.2f, -1.207f)
                arcToRelative(13.596f, 13.596f, 0.0f, false, false, 0.03f, -1.518f)
                close()
                moveTo(18.22f, 10.979f)
                curveToRelative(0.536f, -1.19f, 1.099f, -4.145f, 1.063f, -4.366f)
                arcToRelative(16.444f, 16.444f, 0.0f, false, true, -1.971f, 2.922f)
                curveToRelative(-0.11f, 0.292f, -0.227f, 0.583f, -0.357f, 0.87f)
                arcToRelative(14.203f, 14.203f, 0.0f, false, true, -4.126f, 5.28f)
                quadToRelative(0.11f, 0.8f, 0.14f, 1.612f)
                arcToRelative(15.578f, 15.578f, 0.0f, false, false, 5.251f, -6.318f)
                close()
                moveTo(21.548f, 10.212f)
                quadToRelative(0.022f, -0.24f, 0.037f, -0.478f)
                arcToRelative(15.598f, 15.598f, 0.0f, false, false, -1.598f, -7.95f)
                lineTo(19.098f, 0.0f)
                lineToRelative(-0.412f, 1.953f)
                arcToRelative(14.223f, 14.223f, 0.0f, false, true, -8.378f, 10.15f)
                lineToRelative(-0.612f, 0.258f)
                lineToRelative(0.232f, 0.623f)
                arcToRelative(14.075f, 14.075f, 0.0f, false, true, 0.824f, 6.3f)
                arcToRelative(14.276f, 14.276f, 0.0f, false, true, -0.746f, 3.384f)
                lineTo(9.536f, 24.0f)
                lineToRelative(1.341f, -0.441f)
                arcToRelative(15.616f, 15.616f, 0.0f, false, false, 10.67f, -13.347f)
                close()
                moveTo(12.45f, 21.398f)
                lineToRelative(-0.714f, 0.363f)
                lineToRelative(0.155f, -0.786f)
                arcToRelative(15.701f, 15.701f, 0.0f, false, false, 0.228f, -1.56f)
                arcToRelative(15.508f, 15.508f, 0.0f, false, false, -0.59f, -5.986f)
                lineToRelative(-0.095f, -0.315f)
                lineToRelative(0.293f, -0.146f)
                arcToRelative(15.688f, 15.688f, 0.0f, false, false, 7.339f, -7.72f)
                lineToRelative(0.458f, -1.044f)
                lineToRelative(0.276f, 1.106f)
                arcToRelative(14.043f, 14.043f, 0.0f, false, true, 0.35f, 4.767f)
                arcToRelative(14.153f, 14.153f, 0.0f, false, true, -7.7f, 11.32f)
                close()
            }
        }
        .build()
        return _dask!!
    }

private var _dask: ImageVector? = null
