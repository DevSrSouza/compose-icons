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

public val FillGroup.Linkedin: ImageVector
    get() {
        if (_linkedin != null) {
            return _linkedin!!
        }
        _linkedin = Builder(name = "Linkedin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(15.15f, 8.4f)
                arcTo(5.83f, 5.83f, 0.0f, false, false, 9.3f, 14.22f)
                verticalLineTo(20.1f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.9f, 0.9f)
                horizontalLineToRelative(2.1f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.9f, -0.9f)
                verticalLineTo(14.22f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, true, 2.15f, -1.93f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.75f, 2.0f)
                verticalLineTo(20.1f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.9f, 0.9f)
                horizontalLineToRelative(2.1f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.9f, -0.9f)
                verticalLineTo(14.22f)
                arcTo(5.83f, 5.83f, 0.0f, false, false, 15.15f, 8.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.9f, 9.3f)
                lineTo(6.6f, 9.3f)
                arcTo(0.9f, 0.9f, 0.0f, false, true, 7.5f, 10.2f)
                lineTo(7.5f, 20.1f)
                arcTo(0.9f, 0.9f, 0.0f, false, true, 6.6f, 21.0f)
                lineTo(3.9f, 21.0f)
                arcTo(0.9f, 0.9f, 0.0f, false, true, 3.0f, 20.1f)
                lineTo(3.0f, 10.2f)
                arcTo(0.9f, 0.9f, 0.0f, false, true, 3.9f, 9.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 5.25f)
                moveToRelative(-2.25f, 0.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 4.5f, 0.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, -4.5f, 0.0f)
            }
        }
        .build()
        return _linkedin!!
    }

private var _linkedin: ImageVector? = null
