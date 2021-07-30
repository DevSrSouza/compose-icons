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

public val FillGroup.Scissors: ImageVector
    get() {
        if (_scissors != null) {
            return _scissors!!
        }
        _scissors = Builder(name = "Scissors", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(20.21f, 5.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.42f, -1.42f)
                lineTo(12.51f, 10.6f)
                lineTo(9.21f, 7.29f)
                horizontalLineToRelative(0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.5f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -3.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.29f, -0.3f)
                horizontalLineToRelative(0.0f)
                lineTo(11.1f, 12.0f)
                lineToRelative(-3.29f, 3.3f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.5f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.29f, -1.26f)
                close()
                moveTo(6.5f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.5f, 7.0f)
                close()
                moveTo(6.5f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.5f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.21f, 13.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 1.42f)
                lineToRelative(5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                close()
            }
        }
        .build()
        return _scissors!!
    }

private var _scissors: ImageVector? = null
