package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.HeartDislikeCircle: ImageVector
    get() {
        if (_heartDislikeCircle != null) {
            return _heartDislikeCircle!!
        }
        _heartDislikeCircle = Builder(name = "HeartDislikeCircle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(279.3f, 347.19f)
                curveToRelative(-4.41f, 3.2f, -9.16f, 6.55f, -14.31f, 10.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, true, -18.0f, 0.0f)
                curveToRelative(-39.3f, -26.68f, -56.32f, -45.0f, -65.7f, -56.41f)
                curveToRelative(-20.0f, -24.37f, -29.58f, -49.4f, -29.3f, -76.5f)
                curveToRelative(0.0f, -0.21f, 0.0f, -0.43f, 0.0f, -0.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.82f, -2.72f)
                lineTo(279.76f, 341.12f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 279.3f, 347.19f)
                close()
                moveTo(347.3f, 363.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.62f, 0.0f)
                lineToRelative(-176.0f, -176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.62f, -22.62f)
                lineToRelative(176.0f, 176.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 347.31f, 363.31f)
                close()
                moveTo(333.2f, 297.69f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, -6.0f, 0.37f)
                lineToRelative(-124.0f, -123.21f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 206.0f, 168.0f)
                lineToRelative(1.55f, 0.0f)
                curveToRelative(20.4f, 0.0f, 35.0f, 10.64f, 44.11f, 20.42f)
                arcToRelative(5.93f, 5.93f, 0.0f, false, false, 8.7f, 0.0f)
                curveToRelative(9.11f, -9.78f, 23.71f, -20.42f, 44.11f, -20.42f)
                curveToRelative(30.31f, 0.0f, 55.22f, 25.27f, 55.53f, 56.33f)
                curveTo(360.26f, 250.26f, 351.48f, 274.3f, 333.2f, 297.69f)
                close()
            }
        }
        .build()
        return _heartDislikeCircle!!
    }

private var _heartDislikeCircle: ImageVector? = null
