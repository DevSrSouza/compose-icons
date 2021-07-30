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

public val FillGroup.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, 20.0f)
                horizontalLineToRelative(0.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                close()
                moveTo(19.93f, 11.0f)
                lineTo(17.0f, 11.0f)
                arcToRelative(12.91f, 12.91f, 0.0f, false, false, -2.33f, -6.54f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 19.93f, 11.0f)
                close()
                moveTo(9.08f, 13.0f)
                lineTo(15.0f, 13.0f)
                arcToRelative(11.44f, 11.44f, 0.0f, false, true, -3.0f, 6.61f)
                arcTo(11.0f, 11.0f, 0.0f, false, true, 9.08f, 13.0f)
                close()
                moveTo(9.08f, 11.0f)
                arcTo(11.4f, 11.4f, 0.0f, false, true, 12.0f, 4.4f)
                arcTo(11.19f, 11.19f, 0.0f, false, true, 15.0f, 11.0f)
                close()
                moveTo(9.44f, 4.43f)
                arcTo(13.18f, 13.18f, 0.0f, false, false, 7.07f, 11.0f)
                horizontalLineToRelative(-3.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 9.44f, 4.43f)
                close()
                moveTo(4.07f, 13.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(12.86f, 12.86f, 0.0f, false, false, 2.35f, 6.56f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.07f, 13.0f)
                close()
                moveTo(14.62f, 19.55f)
                arcTo(13.14f, 13.14f, 0.0f, false, false, 17.0f, 13.0f)
                horizontalLineToRelative(2.95f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 14.62f, 19.55f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
