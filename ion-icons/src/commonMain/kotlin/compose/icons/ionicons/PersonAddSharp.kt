package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PersonAddSharp: ImageVector
    get() {
        if (_personAddSharp != null) {
            return _personAddSharp!!
        }
        _personAddSharp = Builder(name = "PersonAddSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(106.0f, 304.0f)
                lineToRelative(0.0f, -54.0f)
                lineToRelative(54.0f, 0.0f)
                lineToRelative(0.0f, -36.0f)
                lineToRelative(-54.0f, 0.0f)
                lineToRelative(0.0f, -54.0f)
                lineToRelative(-36.0f, 0.0f)
                lineToRelative(0.0f, 54.0f)
                lineToRelative(-54.0f, 0.0f)
                lineToRelative(0.0f, 36.0f)
                lineToRelative(54.0f, 0.0f)
                lineToRelative(0.0f, 54.0f)
                lineToRelative(36.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 144.0f)
                moveToRelative(-112.0f, 0.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, true, 224.0f, 0.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, true, -224.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 288.0f)
                curveToRelative(-69.42f, 0.0f, -208.0f, 42.88f, -208.0f, 128.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(496.0f)
                verticalLineTo(416.0f)
                curveTo(496.0f, 330.88f, 357.42f, 288.0f, 288.0f, 288.0f)
                close()
            }
        }
        .build()
        return _personAddSharp!!
    }

private var _personAddSharp: ImageVector? = null
