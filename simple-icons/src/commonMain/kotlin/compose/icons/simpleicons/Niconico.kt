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

public val SimpleIcons.Niconico: ImageVector
    get() {
        if (_niconico != null) {
            return _niconico!!
        }
        _niconico = Builder(name = "Niconico", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.479f, 7.534f)
                verticalLineToRelative(12.128f)
                arcTo(2.021f, 2.021f, 0.0f, false, false, 2.5f, 21.683f)
                horizontalLineToRelative(2.389f)
                lineToRelative(1.323f, 2.095f)
                arcToRelative(0.478f, 0.478f, 0.0f, false, false, 0.404f, 0.221f)
                arcToRelative(0.478f, 0.478f, 0.0f, false, false, 0.441f, -0.221f)
                lineToRelative(1.323f, -2.095f)
                horizontalLineToRelative(6.983f)
                lineToRelative(1.323f, 2.095f)
                arcToRelative(0.478f, 0.478f, 0.0f, false, false, 0.441f, 0.221f)
                curveToRelative(0.184f, 0.0f, 0.331f, -0.073f, 0.404f, -0.221f)
                lineToRelative(1.323f, -2.095f)
                horizontalLineToRelative(2.646f)
                arcToRelative(2.021f, 2.021f, 0.0f, false, false, 2.021f, -2.021f)
                verticalLineTo(7.534f)
                arcToRelative(2.021f, 2.021f, 0.0f, false, false, -2.021f, -1.985f)
                horizontalLineToRelative(-7.681f)
                lineToRelative(4.447f, -4.447f)
                lineTo(17.164f, 0.0f)
                lineToRelative(-5.145f, 5.145f)
                lineTo(6.8f, 0.0f)
                lineTo(5.697f, 1.102f)
                lineToRelative(4.41f, 4.41f)
                horizontalLineTo(2.537f)
                arcToRelative(2.021f, 2.021f, 0.0f, false, false, -2.058f, 2.058f)
                close()
            }
        }
        .build()
        return _niconico!!
    }

private var _niconico: ImageVector? = null
