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

public val SolidGroup.LevelDownAlt: ImageVector
    get() {
        if (_levelDownAlt != null) {
            return _levelDownAlt!!
        }
        _levelDownAlt = Builder(name = "LevelDownAlt", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(313.553f, 392.331f)
                lineTo(209.587f, 504.334f)
                curveToRelative(-9.485f, 10.214f, -25.676f, 10.229f, -35.174f, 0.0f)
                lineTo(70.438f, 392.331f)
                curveTo(56.232f, 377.031f, 67.062f, 352.0f, 88.025f, 352.0f)
                horizontalLineTo(152.0f)
                verticalLineTo(80.0f)
                horizontalLineTo(68.024f)
                arcToRelative(11.996f, 11.996f, 0.0f, false, true, -8.485f, -3.515f)
                lineToRelative(-56.0f, -56.0f)
                curveTo(-4.021f, 12.926f, 1.333f, 0.0f, 12.024f, 0.0f)
                horizontalLineTo(208.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, 10.745f, 24.0f, 24.0f)
                verticalLineToRelative(328.0f)
                horizontalLineToRelative(63.966f)
                curveToRelative(20.878f, 0.0f, 31.851f, 24.969f, 17.587f, 40.331f)
                close()
            }
        }
        .build()
        return _levelDownAlt!!
    }

private var _levelDownAlt: ImageVector? = null
