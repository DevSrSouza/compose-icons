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

public val FillGroup.CheckmarkCircle2: ImageVector
    get() {
        if (_checkmarkCircle2 != null) {
            return _checkmarkCircle2!!
        }
        _checkmarkCircle2 = Builder(name = "CheckmarkCircle2", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(16.3f, 9.61f)
                lineTo(11.73f, 15.61f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.79f, 0.39f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.79f, -0.38f)
                lineTo(7.71f, 12.51f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.58f, -1.23f)
                lineToRelative(1.63f, 2.08f)
                lineToRelative(3.78f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.6f, 1.22f)
                close()
            }
        }
        .build()
        return _checkmarkCircle2!!
    }

private var _checkmarkCircle2: ImageVector? = null
