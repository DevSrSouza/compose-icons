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

public val SolidGroup.Seedling: ImageVector
    get() {
        if (_seedling != null) {
            return _seedling!!
        }
        _seedling = Builder(name = "Seedling", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 32.0f)
                curveToRelative(0.0f, 113.6f, -84.6f, 207.5f, -194.2f, 222.0f)
                curveToRelative(-7.1f, -53.4f, -30.6f, -101.6f, -65.3f, -139.3f)
                curveTo(290.8f, 46.3f, 364.0f, 0.0f, 448.0f, 0.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                close()
                moveTo(0.0f, 96.0f)
                curveTo(0.0f, 78.3f, 14.3f, 64.0f, 32.0f, 64.0f)
                horizontalLineTo(64.0f)
                curveToRelative(123.7f, 0.0f, 224.0f, 100.3f, 224.0f, 224.0f)
                verticalLineToRelative(32.0f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(320.0f)
                curveTo(100.3f, 320.0f, 0.0f, 219.7f, 0.0f, 96.0f)
                close()
            }
        }
        .build()
        return _seedling!!
    }

private var _seedling: ImageVector? = null
