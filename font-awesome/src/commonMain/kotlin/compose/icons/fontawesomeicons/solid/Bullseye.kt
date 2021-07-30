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

public val SolidGroup.Bullseye: ImageVector
    get() {
        if (_bullseye != null) {
            return _bullseye!!
        }
        _bullseye = Builder(name = "Bullseye", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.03f, 8.0f, 0.0f, 119.03f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.03f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.03f, 248.0f, -248.0f)
                reflectiveCurveTo(384.97f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(248.0f, 440.0f)
                curveToRelative(-101.69f, 0.0f, -184.0f, -82.29f, -184.0f, -184.0f)
                curveToRelative(0.0f, -101.69f, 82.29f, -184.0f, 184.0f, -184.0f)
                curveToRelative(101.69f, 0.0f, 184.0f, 82.29f, 184.0f, 184.0f)
                curveToRelative(0.0f, 101.69f, -82.29f, 184.0f, -184.0f, 184.0f)
                close()
                moveTo(248.0f, 128.0f)
                curveToRelative(-70.69f, 0.0f, -128.0f, 57.31f, -128.0f, 128.0f)
                reflectiveCurveToRelative(57.31f, 128.0f, 128.0f, 128.0f)
                reflectiveCurveToRelative(128.0f, -57.31f, 128.0f, -128.0f)
                reflectiveCurveToRelative(-57.31f, -128.0f, -128.0f, -128.0f)
                close()
                moveTo(248.0f, 320.0f)
                curveToRelative(-35.29f, 0.0f, -64.0f, -28.71f, -64.0f, -64.0f)
                reflectiveCurveToRelative(28.71f, -64.0f, 64.0f, -64.0f)
                reflectiveCurveToRelative(64.0f, 28.71f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.71f, 64.0f, -64.0f, 64.0f)
                close()
            }
        }
        .build()
        return _bullseye!!
    }

private var _bullseye: ImageVector? = null
