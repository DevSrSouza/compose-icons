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

public val FillGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(17.56f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.46f, -0.11f)
                lineTo(12.0f, 18.22f)
                lineTo(6.9f, 20.89f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.45f, -1.06f)
                lineToRelative(1.0f, -5.63f)
                lineToRelative(-4.12f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.25f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.81f, -0.68f)
                lineToRelative(5.7f, -0.83f)
                lineTo(11.1f, 2.56f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.8f, 0.0f)
                lineToRelative(2.54f, 5.12f)
                lineToRelative(5.7f, 0.83f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.81f, 0.68f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.25f, 1.0f)
                lineToRelative(-4.12f, 4.0f)
                lineToRelative(1.0f, 5.63f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.4f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.56f, 21.0f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
