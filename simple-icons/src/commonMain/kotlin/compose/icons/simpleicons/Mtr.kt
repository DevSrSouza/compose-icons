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

public val SimpleIcons.Mtr: ImageVector
    get() {
        if (_mtr != null) {
            return _mtr!!
        }
        _mtr = Builder(name = "Mtr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.987f, 1.913f)
                curveToRelative(-1.9f, 0.0f, -3.693f, 0.321f, -5.298f, 0.883f)
                curveTo(2.756f, 4.268f, 0.0f, 7.826f, 0.0f, 12.0f)
                curveToRelative(0.0f, 4.147f, 2.756f, 7.706f, 6.689f, 9.204f)
                curveToRelative(1.632f, 0.562f, 3.425f, 0.883f, 5.325f, 0.883f)
                arcToRelative(16.74f, 16.74f, 0.0f, false, false, 5.27f, -0.856f)
                curveTo(21.217f, 19.759f, 24.0f, 16.174f, 24.0f, 12.027f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, -4.174f, -2.783f, -7.732f, -6.716f, -9.204f)
                arcToRelative(16.295f, 16.295f, 0.0f, false, false, -5.297f, -0.883f)
                close()
                moveTo(10.89f, 5.257f)
                horizontalLineToRelative(2.167f)
                verticalLineToRelative(3.827f)
                curveToRelative(1.525f, -0.402f, 2.702f, -1.766f, 2.782f, -3.399f)
                lineToRelative(2.168f, 0.027f)
                curveToRelative(-0.16f, 2.73f, -2.22f, 4.95f, -4.897f, 5.378f)
                verticalLineToRelative(1.793f)
                curveToRelative(2.676f, 0.428f, 4.736f, 2.675f, 4.924f, 5.404f)
                lineToRelative(-2.167f, 0.028f)
                curveToRelative(-0.08f, -1.633f, -1.258f, -2.997f, -2.783f, -3.425f)
                verticalLineToRelative(3.853f)
                horizontalLineToRelative(-2.167f)
                verticalLineTo(14.89f)
                arcToRelative(3.775f, 3.775f, 0.0f, false, false, -2.81f, 3.425f)
                lineToRelative(-2.167f, -0.028f)
                arcToRelative(5.868f, 5.868f, 0.0f, false, true, 4.923f, -5.404f)
                verticalLineToRelative(-1.766f)
                curveTo(8.187f, 10.716f, 6.1f, 8.468f, 5.94f, 5.74f)
                lineToRelative(2.167f, -0.027f)
                arcTo(3.711f, 3.711f, 0.0f, false, false, 10.89f, 9.11f)
                close()
            }
        }
        .build()
        return _mtr!!
    }

private var _mtr: ImageVector? = null
