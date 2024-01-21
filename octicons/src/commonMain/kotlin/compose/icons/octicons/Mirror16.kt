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

public val Octicons.Mirror16: ImageVector
    get() {
        if (_mirror16 != null) {
            return _mirror16!!
        }
        _mirror16 = Builder(name = "Mirror16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.547f, 3.061f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 16.0f, 3.75f)
                verticalLineToRelative(8.5f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.265f, 0.545f)
                lineToRelative(-4.5f, -4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.09f)
                lineToRelative(4.5f, -4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.812f, -0.144f)
                close()
                moveTo(0.0f, 12.25f)
                verticalLineToRelative(-8.5f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 1.265f, -0.545f)
                lineToRelative(4.5f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.09f)
                lineToRelative(-4.5f, 4.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 0.0f, 12.25f)
                close()
                moveTo(1.5f, 5.49f)
                verticalLineToRelative(5.02f)
                lineTo(4.158f, 8.0f)
                close()
                moveTo(11.842f, 8.0f)
                lineToRelative(2.658f, 2.51f)
                lineTo(14.5f, 5.49f)
                close()
                moveTo(8.0f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-0.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.0f, 4.0f)
                close()
                moveTo(8.75f, 1.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(8.75f, 7.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(8.0f, 10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-0.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.0f, 10.0f)
                close()
                moveTo(8.0f, 13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-0.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.0f, 13.0f)
                close()
            }
        }
        .build()
        return _mirror16!!
    }

private var _mirror16: ImageVector? = null
