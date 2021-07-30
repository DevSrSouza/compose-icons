package compose.icons.feathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.FeatherIcons

public val FeatherIcons.RefreshCw: ImageVector
    get() {
        if (_refreshCw != null) {
            return _refreshCw!!
        }
        _refreshCw = Builder(name = "RefreshCw", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.0f, 4.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(-6.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 20.0f)
                lineToRelative(0.0f, -6.0f)
                lineToRelative(6.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.51f, 9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 14.85f, -3.36f)
                lineTo(23.0f, 10.0f)
                moveTo(1.0f, 14.0f)
                lineToRelative(4.64f, 4.36f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 20.49f, 15.0f)
            }
        }
        .build()
        return _refreshCw!!
    }

private var _refreshCw: ImageVector? = null
