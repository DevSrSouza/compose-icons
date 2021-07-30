package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.SpellCheck: ImageVector
    get() {
        if (_spellCheck != null) {
            return _spellCheck!!
        }
        _spellCheck = Builder(name = "SpellCheck", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 256.0f)
                horizontalLineToRelative(91.36f)
                curveToRelative(43.2f, 0.0f, 82.0f, -32.2f, 84.51f, -75.34f)
                arcToRelative(79.82f, 79.82f, 0.0f, false, false, -25.26f, -63.07f)
                arcToRelative(79.81f, 79.81f, 0.0f, false, false, 9.06f, -44.91f)
                curveTo(427.9f, 30.57f, 389.3f, 0.0f, 347.0f, 0.0f)
                horizontalLineToRelative(-75.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                close()
                moveTo(312.0f, 56.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 48.0f)
                horizontalLineToRelative(-40.0f)
                close()
                moveTo(312.0f, 152.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 48.0f)
                horizontalLineToRelative(-56.0f)
                close()
                moveTo(155.12f, 22.25f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 124.64f, 0.0f)
                lineTo(99.36f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -30.48f, 22.25f)
                lineTo(0.59f, 235.73f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 256.0f)
                horizontalLineToRelative(24.93f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.42f, -11.73f)
                lineTo(68.29f, 208.0f)
                horizontalLineToRelative(87.42f)
                lineToRelative(11.94f, 36.27f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 183.07f, 256.0f)
                lineTo(208.0f, 256.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.42f, -20.27f)
                close()
                moveTo(89.37f, 144.0f)
                lineTo(112.0f, 75.3f)
                lineToRelative(22.63f, 68.7f)
                close()
                moveTo(571.37f, 276.48f)
                lineToRelative(-45.21f, -45.3f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, false, -22.59f, 0.0f)
                lineToRelative(-151.5f, 151.5f)
                lineToRelative(-55.41f, -55.5f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, false, -22.59f, 0.0f)
                lineToRelative(-45.3f, 45.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.59f)
                lineToRelative(112.0f, 112.21f)
                arcToRelative(15.89f, 15.89f, 0.0f, false, false, 22.6f, 0.0f)
                lineToRelative(208.0f, -208.21f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -0.02f, -22.59f)
                close()
            }
        }
        .build()
        return _spellCheck!!
    }

private var _spellCheck: ImageVector? = null
