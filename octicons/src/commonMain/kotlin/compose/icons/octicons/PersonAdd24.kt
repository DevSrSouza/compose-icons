package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.PersonAdd24: ImageVector
    get() {
        if (_personAdd24 != null) {
            return _personAdd24!!
        }
        _personAdd24 = Builder(name = "PersonAdd24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 9.5f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 7.916f, 4.062f)
                arcToRelative(7.973f, 7.973f, 0.0f, false, true, 5.018f, 7.166f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.499f, 0.044f)
                arcToRelative(6.469f, 6.469f, 0.0f, false, false, -12.932f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.499f, -0.044f)
                arcToRelative(7.972f, 7.972f, 0.0f, false, true, 5.059f, -7.181f)
                arcTo(4.994f, 4.994f, 0.0f, false, true, 4.0f, 9.5f)
                close()
                moveTo(9.0f, 6.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                close()
                moveTo(19.25f, 1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                lineTo(20.0f, 4.0f)
                horizontalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(20.0f, 5.5f)
                verticalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(18.5f, 5.5f)
                horizontalLineToRelative(-2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(2.25f)
                lineTo(18.5f, 1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                close()
            }
        }
        .build()
        return _personAdd24!!
    }

private var _personAdd24: ImageVector? = null
