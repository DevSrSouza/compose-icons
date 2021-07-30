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

public val OutlineGroup.ChevronLeft: ImageVector
    get() {
        if (_chevronLeft != null) {
            return _chevronLeft!!
        }
        _chevronLeft = Builder(name = "ChevronLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                lineToRelative(-0.0f, 24.0f)
                lineToRelative(-24.0f, 0.0f)
                lineToRelative(-0.0f, -24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.36f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.72f, -0.31f)
                lineToRelative(-3.86f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.4f)
                lineToRelative(4.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.42f, 1.42f)
                lineTo(10.9f, 12.0f)
                lineToRelative(3.18f, 3.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.41f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.36f, 17.0f)
                close()
            }
        }
        .build()
        return _chevronLeft!!
    }

private var _chevronLeft: ImageVector? = null
