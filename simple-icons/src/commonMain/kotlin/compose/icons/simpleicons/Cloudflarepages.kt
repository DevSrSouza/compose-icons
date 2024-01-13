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

public val SimpleIcons.Cloudflarepages: ImageVector
    get() {
        if (_cloudflarepages != null) {
            return _cloudflarepages!!
        }
        _cloudflarepages = Builder(name = "Cloudflarepages", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.715f, 14.32f)
                lineTo(5.442f, 14.32f)
                lineToRelative(-0.64f, -1.203f)
                lineTo(13.673f, 0.0f)
                lineToRelative(1.397f, 0.579f)
                lineToRelative(-1.752f, 9.112f)
                horizontalLineToRelative(5.24f)
                lineToRelative(0.648f, 1.192f)
                lineTo(10.719f, 24.0f)
                lineToRelative(-1.412f, -0.54f)
                close()
                moveTo(4.091f, 5.448f)
                arcToRelative(0.5787f, 0.5787f, 0.0f, true, true, 0.0f, -1.1574f)
                arcToRelative(0.5787f, 0.5787f, 0.0f, false, true, 0.0f, 1.1574f)
                close()
                moveTo(5.634f, 5.448f)
                arcToRelative(0.5787f, 0.5787f, 0.0f, true, true, 0.0f, -1.1574f)
                arcToRelative(0.5787f, 0.5787f, 0.0f, false, true, 0.0f, 1.1574f)
                close()
                moveTo(7.178f, 5.448f)
                arcToRelative(0.5787f, 0.5787f, 0.0f, true, true, 0.0f, -1.1574f)
                arcToRelative(0.5787f, 0.5787f, 0.0f, false, true, 0.0f, 1.1574f)
                close()
                moveTo(15.835f, 2.748f)
                horizontalLineToRelative(5.424f)
                lineToRelative(0.772f, 0.771f)
                verticalLineToRelative(16.975f)
                lineToRelative(-0.772f, 0.772f)
                horizontalLineToRelative(-7.392f)
                lineToRelative(0.374f, -0.579f)
                horizontalLineToRelative(6.779f)
                lineToRelative(0.432f, -0.432f)
                lineTo(21.452f, 3.758f)
                lineToRelative(-0.432f, -0.432f)
                horizontalLineToRelative(-4.676f)
                lineToRelative(-0.552f, 2.85f)
                horizontalLineToRelative(-0.59f)
                lineToRelative(0.529f, -2.877f)
                lineToRelative(0.108f, -0.552f)
                close()
                moveTo(2.74f, 21.265f)
                lineToRelative(-0.772f, -0.772f)
                lineTo(1.968f, 3.518f)
                lineToRelative(0.772f, -0.771f)
                horizontalLineToRelative(7.677f)
                lineToRelative(-0.386f, 0.579f)
                lineTo(2.98f, 3.326f)
                lineToRelative(-0.432f, 0.432f)
                verticalLineToRelative(16.496f)
                lineToRelative(0.432f, 0.432f)
                horizontalLineToRelative(5.586f)
                lineToRelative(-0.092f, 0.579f)
                close()
                moveTo(3.897f, 19.335f)
                horizontalLineToRelative(3.28f)
                lineToRelative(-0.116f, 0.58f)
                horizontalLineToRelative(-3.55f)
                lineToRelative(-0.192f, -0.193f)
                verticalLineToRelative(-3.473f)
                lineToRelative(0.578f, 1.158f)
                close()
                moveTo(17.014f, 19.335f)
                lineTo(17.593f, 19.915f)
                lineTo(14.7f, 19.915f)
                lineToRelative(0.385f, -0.58f)
                close()
            }
        }
        .build()
        return _cloudflarepages!!
    }

private var _cloudflarepages: ImageVector? = null
