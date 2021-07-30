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
                moveTo(313.553f, 119.669f)
                lineTo(209.587f, 7.666f)
                curveToRelative(-9.485f, -10.214f, -25.676f, -10.229f, -35.174f, 0.0f)
                lineTo(70.438f, 119.669f)
                curveTo(56.232f, 134.969f, 67.062f, 160.0f, 88.025f, 160.0f)
                horizontalLineTo(152.0f)
                verticalLineToRelative(272.0f)
                horizontalLineTo(68.024f)
                arcToRelative(11.996f, 11.996f, 0.0f, false, false, -8.485f, 3.515f)
                lineToRelative(-56.0f, 56.0f)
                curveTo(-4.021f, 499.074f, 1.333f, 512.0f, 12.024f, 512.0f)
                horizontalLineTo(208.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(63.966f)
                curveToRelative(20.878f, 0.0f, 31.851f, -24.969f, 17.587f, -40.331f)
                close()
            }
        }
        .build()
        return _levelUpAlt!!
    }

private var _levelUpAlt: ImageVector? = null
