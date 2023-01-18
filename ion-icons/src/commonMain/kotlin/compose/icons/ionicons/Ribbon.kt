package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.Ribbon: ImageVector
    get() {
        if (_ribbon != null) {
            return _ribbon!!
        }
        _ribbon = Builder(name = "Ribbon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(269.0f, 335.61f)
                quadToRelative(-6.33f, 0.47f, -12.78f, 0.47f)
                curveToRelative(-5.23f, 0.0f, -10.4f, -0.24f, -15.51f, -0.69f)
                arcToRelative(176.11f, 176.11f, 0.0f, false, true, -127.67f, -72.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.77f, 0.35f)
                lineToRelative(-72.0f, 129.4f)
                curveToRelative(-2.74f, 5.0f, -3.17f, 11.0f, -0.28f, 15.88f)
                arcTo(16.78f, 16.78f, 0.0f, false, false, 48.22f, 416.0f)
                horizontalLineToRelative(78.0f)
                arcToRelative(15.28f, 15.28f, 0.0f, false, true, 13.62f, 7.33f)
                lineTo(178.5f, 488.0f)
                arcToRelative(16.26f, 16.26f, 0.0f, false, false, 13.75f, 8.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(5.94f, -0.33f, 12.09f, -4.19f, 14.56f, -9.6f)
                lineToRelative(66.11f, -145.15f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 269.0f, 335.61f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(477.64f, 391.88f)
                lineTo(406.11f, 262.71f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.74f, -0.36f)
                arcToRelative(176.5f, 176.5f, 0.0f, false, true, -78.31f, 61.42f)
                arcToRelative(16.09f, 16.09f, 0.0f, false, false, -8.72f, 8.25f)
                lineToRelative(-36.86f, 81.1f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, 0.0f, 6.6f)
                lineToRelative(30.27f, 66.59f)
                curveToRelative(2.45f, 5.41f, 8.59f, 9.36f, 14.52f, 9.69f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, false, 13.7f, -8.12f)
                lineTo(372.5f, 423.3f)
                curveToRelative(2.89f, -4.85f, 8.13f, -7.33f, 13.78f, -7.3f)
                horizontalLineToRelative(78.77f)
                curveToRelative(6.67f, 0.0f, 11.72f, -3.48f, 14.0f, -10.0f)
                arcTo(16.92f, 16.92f, 0.0f, false, false, 477.64f, 391.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.25f, 160.0f)
                arcToRelative(48.01f, 48.0f, 0.0f, true, false, 96.02f, 0.0f)
                arcToRelative(48.01f, 48.0f, 0.0f, true, false, -96.02f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.26f, 16.0f)
                curveToRelative(-79.42f, 0.0f, -144.0f, 64.59f, -144.0f, 144.0f)
                reflectiveCurveToRelative(64.61f, 144.0f, 144.0f, 144.0f)
                reflectiveCurveToRelative(144.0f, -64.6f, 144.0f, -144.0f)
                reflectiveCurveTo(335.67f, 16.0f, 256.26f, 16.0f)
                close()
                moveTo(256.26f, 240.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 80.0f, -80.0f)
                arcTo(80.1f, 80.1f, 0.0f, false, true, 256.26f, 240.0f)
                close()
            }
        }
        .build()
        return _ribbon!!
    }

private var _ribbon: ImageVector? = null
