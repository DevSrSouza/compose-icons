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

public val FillGroup.Activity: ImageVector
    get() {
        if (_activity != null) {
            return _activity!!
        }
        _activity = Builder(name = "Activity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(14.33f, 20.0f)
                horizontalLineToRelative(-0.21f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.76f, -1.58f)
                lineTo(9.68f, 6.0f)
                lineTo(6.92f, 12.4f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 13.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineTo(5.34f)
                lineTo(7.85f, 5.21f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.79f, 0.38f)
                lineTo(14.32f, 18.0f)
                lineToRelative(2.76f, -6.38f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineTo(18.66f)
                lineToRelative(-2.51f, 5.79f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.33f, 20.0f)
                close()
            }
        }
        .build()
        return _activity!!
    }

private var _activity: ImageVector? = null
