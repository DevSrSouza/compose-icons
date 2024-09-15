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

public val SimpleIcons.Teamcity: ImageVector
    get() {
        if (_teamcity != null) {
            return _teamcity!!
        }
        _teamcity = Builder(name = "Teamcity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-24.0f)
                close()
                moveTo(2.664f, 2.964f)
                horizontalLineToRelative(7.48f)
                verticalLineToRelative(1.832f)
                horizontalLineToRelative(-2.748f)
                verticalLineToRelative(7.196f)
                horizontalLineToRelative(-1.984f)
                verticalLineToRelative(-7.196f)
                horizontalLineToRelative(-2.748f)
                close()
                moveTo(11.992f, 20.964f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(17.556f, 11.746f)
                arcToRelative(4.62f, 4.62f, 0.0f, false, true, -2.036f, 0.374f)
                arcToRelative(4.556f, 4.556f, 0.0f, false, true, -4.628f, -4.616f)
                verticalLineToRelative(-0.024f)
                arcToRelative(4.584f, 4.584f, 0.0f, false, true, 4.708f, -4.668f)
                arcToRelative(4.656f, 4.656f, 0.0f, false, true, 3.56f, 1.388f)
                lineToRelative(-1.264f, 1.456f)
                arcToRelative(3.336f, 3.336f, 0.0f, false, false, -2.312f, -1.02f)
                arcToRelative(2.671f, 2.671f, 0.0f, false, false, -2.616f, 2.8f)
                verticalLineToRelative(0.028f)
                arcToRelative(2.681f, 2.681f, 0.0f, false, false, 2.616f, 2.836f)
                arcToRelative(3.226f, 3.226f, 0.0f, false, false, 2.376f, -1.056f)
                lineToRelative(1.264f, 1.276f)
                arcToRelative(4.619f, 4.619f, 0.0f, false, true, -1.668f, 1.226f)
                close()
            }
        }
        .build()
        return _teamcity!!
    }

private var _teamcity: ImageVector? = null
