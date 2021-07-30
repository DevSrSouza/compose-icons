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

public val OutlineGroup.PhoneMissed: ImageVector
    get() {
        if (_phoneMissed != null) {
            return _phoneMissed!!
        }
        _phoneMissed = Builder(name = "PhoneMissed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(21.94f, 16.64f)
                arcToRelative(4.34f, 4.34f, 0.0f, false, false, -0.19f, -0.73f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.72f, -0.65f)
                lineToRelative(-6.0f, -1.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.92f, 0.26f)
                curveToRelative(-0.14f, 0.13f, -0.15f, 0.14f, -0.8f, 1.38f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -4.88f, -4.89f)
                curveTo(9.71f, 10.0f, 9.72f, 10.0f, 9.85f, 9.85f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.26f, -0.92f)
                lineTo(8.74f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.65f, -0.72f)
                arcToRelative(3.79f, 3.79f, 0.0f, false, false, -0.72f, -0.18f)
                arcTo(3.94f, 3.94f, 0.0f, false, false, 6.6f, 2.0f)
                arcTo(4.6f, 4.6f, 0.0f, false, false, 2.0f, 6.6f)
                arcTo(15.42f, 15.42f, 0.0f, false, false, 17.4f, 22.0f)
                arcTo(4.6f, 4.6f, 0.0f, false, false, 22.0f, 17.4f)
                arcTo(4.77f, 4.77f, 0.0f, false, false, 21.94f, 16.64f)
                close()
                moveTo(17.4f, 20.0f)
                arcTo(13.41f, 13.41f, 0.0f, false, true, 4.0f, 6.6f)
                arcTo(2.61f, 2.61f, 0.0f, false, true, 6.6f, 4.0f)
                lineToRelative(0.33f, 0.0f)
                lineTo(8.0f, 8.64f)
                lineToRelative(-0.55f, 0.29f)
                curveToRelative(-0.87f, 0.45f, -1.5f, 0.78f, -1.17f, 1.58f)
                arcToRelative(11.85f, 11.85f, 0.0f, false, false, 7.18f, 7.21f)
                curveToRelative(0.84f, 0.34f, 1.17f, -0.29f, 1.62f, -1.16f)
                lineToRelative(0.29f, -0.55f)
                lineTo(20.0f, 17.07f)
                curveToRelative(0.0f, 0.11f, 0.0f, 0.22f, 0.0f, 0.33f)
                arcTo(2.61f, 2.61f, 0.0f, false, true, 17.4f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.8f, 8.7f)
                arcToRelative(1.05f, 1.05f, 0.0f, false, false, 1.47f, 0.0f)
                lineTo(18.0f, 8.0f)
                lineToRelative(0.73f, 0.73f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.2f, 7.23f)
                lineToRelative(-0.73f, -0.73f)
                lineToRelative(0.73f, -0.73f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.73f, 4.3f)
                lineTo(18.0f, 5.0f)
                lineToRelative(-0.73f, -0.73f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.8f, 5.77f)
                lineToRelative(0.73f, 0.73f)
                lineToRelative(-0.73f, 0.73f)
                arcTo(1.05f, 1.05f, 0.0f, false, false, 15.8f, 8.7f)
                close()
            }
        }
        .build()
        return _phoneMissed!!
    }

private var _phoneMissed: ImageVector? = null
