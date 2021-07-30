package compose.icons.evaicons.fill

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
import compose.icons.evaicons.FillGroup

public val FillGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.71f, -0.29f)
                lineTo(3.52f, 12.93f)
                arcToRelative(5.26f, 5.26f, 0.0f, false, true, 0.0f, -7.4f)
                arcToRelative(5.24f, 5.24f, 0.0f, false, true, 7.4f, 0.0f)
                lineTo(12.0f, 6.61f)
                lineToRelative(1.08f, -1.08f)
                arcToRelative(5.24f, 5.24f, 0.0f, false, true, 7.4f, 0.0f)
                arcToRelative(5.26f, 5.26f, 0.0f, false, true, 0.0f, 7.4f)
                lineToRelative(-7.77f, 7.78f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
