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

public val SolidGroup.LevelUpAlt: ImageVector
    get() {
        if (_levelUpAlt != null) {
            return _levelUpAlt!!
        }
        _levelUpAlt = Builder(name = "LevelUpAlt", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(313.55f, 119.67f)
                lineTo(209.59f, 7.67f)
                curveToRelative(-9.48f, -10.21f, -25.68f, -10.23f, -35.17f, 0.0f)
                lineTo(70.44f, 119.67f)
                curveTo(56.23f, 134.97f, 67.06f, 160.0f, 88.03f, 160.0f)
                horizontalLineTo(152.0f)
                verticalLineToRelative(272.0f)
                horizontalLineTo(68.02f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.48f, 3.52f)
                lineToRelative(-56.0f, 56.0f)
                curveTo(-4.02f, 499.07f, 1.33f, 512.0f, 12.02f, 512.0f)
                horizontalLineTo(208.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(63.97f)
                curveToRelative(20.88f, 0.0f, 31.85f, -24.97f, 17.59f, -40.33f)
                close()
            }
        }
        .build()
        return _levelUpAlt!!
    }

private var _levelUpAlt: ImageVector? = null
