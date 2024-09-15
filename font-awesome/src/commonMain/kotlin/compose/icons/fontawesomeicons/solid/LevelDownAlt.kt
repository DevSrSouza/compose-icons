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
                moveTo(313.55f, 392.33f)
                lineTo(209.59f, 504.33f)
                curveToRelative(-9.48f, 10.21f, -25.68f, 10.23f, -35.17f, 0.0f)
                lineTo(70.44f, 392.33f)
                curveTo(56.23f, 377.03f, 67.06f, 352.0f, 88.03f, 352.0f)
                horizontalLineTo(152.0f)
                verticalLineTo(80.0f)
                horizontalLineTo(68.02f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.48f, -3.52f)
                lineToRelative(-56.0f, -56.0f)
                curveTo(-4.02f, 12.93f, 1.33f, 0.0f, 12.02f, 0.0f)
                horizontalLineTo(208.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, 10.74f, 24.0f, 24.0f)
                verticalLineToRelative(328.0f)
                horizontalLineToRelative(63.97f)
                curveToRelative(20.88f, 0.0f, 31.85f, 24.97f, 17.59f, 40.33f)
                close()
            }
        }
        .build()
        return _levelDownAlt!!
    }

private var _levelDownAlt: ImageVector? = null
