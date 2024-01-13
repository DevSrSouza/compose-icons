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

public val SimpleIcons.Barmenia: ImageVector
    get() {
        if (_barmenia != null) {
            return _barmenia!!
        }
        _barmenia = Builder(name = "Barmenia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.046f, 13.427f)
                verticalLineToRelative(6.395f)
                horizontalLineToRelative(5.709f)
                arcToRelative(5.41f, 5.41f, 0.0f, false, false, 2.377f, -0.422f)
                curveToRelative(1.021f, -0.537f, 1.532f, -1.537f, 1.532f, -2.999f)
                arcToRelative(2.591f, 2.591f, 0.0f, false, false, -1.492f, -2.571f)
                arcToRelative(5.834f, 5.834f, 0.0f, false, false, -2.347f, -0.403f)
                close()
                moveTo(7.046f, 4.167f)
                verticalLineToRelative(5.287f)
                horizontalLineToRelative(5.714f)
                arcToRelative(4.722f, 4.722f, 0.0f, false, false, 2.486f, -0.592f)
                curveToRelative(0.637f, -0.398f, 0.955f, -1.101f, 0.955f, -2.109f)
                curveToRelative(0.0f, -1.117f, -0.421f, -1.855f, -1.263f, -2.213f)
                arcToRelative(8.63f, 8.63f, 0.0f, false, false, -2.78f, -0.368f)
                close()
                moveTo(19.807f, 2.556f)
                arcToRelative(6.19f, 6.19f, 0.0f, false, true, 1.079f, 3.66f)
                arcToRelative(5.433f, 5.433f, 0.0f, false, true, -1.089f, 3.531f)
                arcToRelative(5.617f, 5.617f, 0.0f, false, true, -1.791f, 1.388f)
                arcToRelative(5.232f, 5.232f, 0.0f, false, true, 2.716f, 2.113f)
                arcToRelative(6.474f, 6.474f, 0.0f, false, true, 0.915f, 3.481f)
                arcToRelative(7.069f, 7.069f, 0.0f, false, true, -1.05f, 3.854f)
                arcToRelative(6.467f, 6.467f, 0.0f, false, true, -4.316f, 3.093f)
                curveToRelative(-1.093f, 0.222f, -2.207f, 0.33f, -3.322f, 0.324f)
                lineTo(2.361f, 24.0f)
                lineTo(2.361f, 0.0f)
                lineTo(13.72f, 0.0f)
                curveToRelative(2.864f, 0.046f, 4.893f, 0.899f, 6.087f, 2.556f)
            }
        }
        .build()
        return _barmenia!!
    }

private var _barmenia: ImageVector? = null
