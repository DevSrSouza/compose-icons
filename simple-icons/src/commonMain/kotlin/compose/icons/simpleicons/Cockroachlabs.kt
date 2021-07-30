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

public val SimpleIcons.Cockroachlabs: ImageVector
    get() {
        if (_cockroachlabs != null) {
            return _cockroachlabs!!
        }
        _cockroachlabs = Builder(name = "Cockroachlabs", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.645f, 16.155f)
                arcToRelative(13.013f, 13.013f, 0.0f, false, false, -4.479f, -13.287f)
                arcToRelative(11.617f, 11.617f, 0.0f, false, true, 5.815f, -1.546f)
                curveToRelative(0.774f, 0.0f, 1.545f, 0.075f, 2.304f, 0.226f)
                lineToRelative(0.32f, -1.282f)
                arcTo(13.092f, 13.092f, 0.0f, false, false, 18.98f, 0.0f)
                arcTo(12.93f, 12.93f, 0.0f, false, false, 12.0f, 2.03f)
                arcTo(12.933f, 12.933f, 0.0f, false, false, 5.021f, 0.0f)
                curveTo(4.139f, 0.0f, 3.26f, 0.089f, 2.396f, 0.266f)
                lineToRelative(0.319f, 1.282f)
                arcToRelative(11.83f, 11.83f, 0.0f, false, true, 2.306f, -0.226f)
                arcToRelative(11.64f, 11.64f, 0.0f, false, true, 5.817f, 1.544f)
                arcToRelative(13.01f, 13.01f, 0.0f, false, false, 0.792f, 20.877f)
                lineToRelative(0.375f, 0.257f)
                lineToRelative(0.373f, -0.257f)
                curveToRelative(2.624f, -1.801f, 4.5f, -4.5f, 5.27f, -7.588f)
                close()
                moveTo(11.34f, 21.855f)
                arcTo(11.687f, 11.687f, 0.0f, false, true, 7.825f, 9.519f)
                arcToRelative(13.08f, 13.08f, 0.0f, false, false, 2.457f, 2.977f)
                arcToRelative(3.202f, 3.202f, 0.0f, false, true, 1.058f, 2.383f)
                close()
                moveTo(12.001f, 12.198f)
                arcToRelative(11.717f, 11.717f, 0.0f, false, true, -2.343f, -2.315f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, true, 0.0f, -3.912f)
                arcToRelative(11.67f, 11.67f, 0.0f, false, true, 2.347f, -2.333f)
                curveToRelative(0.9f, 0.671f, 1.697f, 1.468f, 2.37f, 2.366f)
                arcToRelative(3.197f, 3.197f, 0.0f, false, true, 0.0f, 3.832f)
                arcToRelative(11.816f, 11.816f, 0.0f, false, true, -2.374f, 2.362f)
                close()
                moveTo(12.66f, 21.855f)
                verticalLineToRelative(-6.976f)
                arcToRelative(3.202f, 3.202f, 0.0f, false, true, 1.06f, -2.383f)
                arcToRelative(13.026f, 13.026f, 0.0f, false, false, 2.455f, -2.977f)
                arcToRelative(11.694f, 11.694f, 0.0f, false, true, -3.515f, 12.336f)
                close()
            }
        }
        .build()
        return _cockroachlabs!!
    }

private var _cockroachlabs: ImageVector? = null
