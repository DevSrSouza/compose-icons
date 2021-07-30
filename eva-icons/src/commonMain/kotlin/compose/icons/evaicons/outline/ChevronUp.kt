package compose.icons.evaicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.ChevronUp: ImageVector
    get() {
        if (_chevronUp != null) {
            return _chevronUp!!
        }
        _chevronUp = Builder(name = "ChevronUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineToRelative(-24.0f, -0.0f)
                lineToRelative(-0.0f, -24.0f)
                lineToRelative(24.0f, -0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 14.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.71f, -0.29f)
                lineTo(12.0f, 10.9f)
                lineToRelative(-3.3f, 3.18f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.41f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.42f)
                lineToRelative(4.0f, -3.86f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 0.0f)
                lineToRelative(4.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.42f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 14.5f)
                close()
            }
        }
        .build()
        return _chevronUp!!
    }

private var _chevronUp: ImageVector? = null
