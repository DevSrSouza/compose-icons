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

public val SolidGroup.D: ImageVector
    get() {
        if (_d != null) {
            return _d!!
        }
        _d = Builder(name = "D", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 46.3f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(160.0f)
                curveToRelative(123.7f, 0.0f, 224.0f, 100.3f, 224.0f, 224.0f)
                reflectiveCurveToRelative(-100.3f, 224.0f, -224.0f, 224.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(64.0f)
                close()
                moveTo(64.0f, 96.0f)
                verticalLineTo(416.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(88.4f, 0.0f, 160.0f, -71.6f, 160.0f, -160.0f)
                reflectiveCurveToRelative(-71.6f, -160.0f, -160.0f, -160.0f)
                horizontalLineTo(64.0f)
                close()
            }
        }
        .build()
        return _d!!
    }

private var _d: ImageVector? = null
