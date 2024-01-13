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

public val SimpleIcons.Leagueoflegends: ImageVector
    get() {
        if (_leagueoflegends != null) {
            return _leagueoflegends!!
        }
        _leagueoflegends = Builder(name = "Leagueoflegends", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.912f, 0.0f)
                lineToRelative(1.212f, 2.474f)
                verticalLineToRelative(19.053f)
                lineTo(1.912f, 24.0f)
                horizontalLineToRelative(14.73f)
                lineToRelative(1.337f, -4.682f)
                lineTo(8.33f, 19.318f)
                lineTo(8.33f, 0.0f)
                close()
                moveTo(12.0f, 1.516f)
                curveToRelative(-0.913f, 0.0f, -1.798f, 0.112f, -2.648f, 0.312f)
                verticalLineToRelative(1.74f)
                arcToRelative(9.738f, 9.738f, 0.0f, false, true, 2.648f, -0.368f)
                curveToRelative(5.267f, 0.0f, 9.536f, 4.184f, 9.536f, 9.348f)
                arcToRelative(9.203f, 9.203f, 0.0f, false, true, -2.3f, 6.086f)
                lineToRelative(-0.273f, 0.954f)
                lineToRelative(-0.602f, 2.112f)
                curveToRelative(2.952f, -1.993f, 4.89f, -5.335f, 4.89f, -9.122f)
                curveTo(23.25f, 6.468f, 18.213f, 1.516f, 12.0f, 1.516f)
                close()
                moveTo(12.0f, 4.189f)
                curveToRelative(-0.924f, 0.0f, -1.814f, 0.148f, -2.648f, 0.414f)
                verticalLineToRelative(13.713f)
                horizontalLineToRelative(8.817f)
                arcToRelative(8.246f, 8.246f, 0.0f, false, false, 2.36f, -5.768f)
                curveToRelative(0.0f, -4.617f, -3.818f, -8.359f, -8.529f, -8.359f)
                close()
                moveTo(2.104f, 7.312f)
                arcTo(10.858f, 10.858f, 0.0f, false, false, 0.75f, 12.576f)
                curveToRelative(0.0f, 1.906f, 0.492f, 3.7f, 1.355f, 5.266f)
                close()
            }
        }
        .build()
        return _leagueoflegends!!
    }

private var _leagueoflegends: ImageVector? = null
