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

public val FillGroup.Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = Builder(name = "Twitter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                lineToRelative(24.0f, 0.0f)
                lineToRelative(0.0f, 24.0f)
                lineToRelative(-24.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.08f, 20.0f)
                arcTo(11.07f, 11.07f, 0.0f, false, false, 19.52f, 9.0f)
                arcTo(8.09f, 8.09f, 0.0f, false, false, 21.0f, 6.16f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, false, -0.62f, -0.51f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, true, -2.16f, -0.38f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, false, -5.58f, -0.17f)
                arcTo(4.13f, 4.13f, 0.0f, false, false, 11.49f, 9.0f)
                curveTo(8.14f, 9.2f, 5.84f, 7.61f, 4.0f, 5.43f)
                arcToRelative(0.43f, 0.43f, 0.0f, false, false, -0.75f, 0.24f)
                arcTo(9.68f, 9.68f, 0.0f, false, false, 7.85f, 15.72f)
                arcTo(6.73f, 6.73f, 0.0f, false, true, 3.38f, 18.0f)
                arcToRelative(0.45f, 0.45f, 0.0f, false, false, -0.14f, 0.84f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 8.08f, 20.0f)
            }
        }
        .build()
        return _twitter!!
    }

private var _twitter: ImageVector? = null
