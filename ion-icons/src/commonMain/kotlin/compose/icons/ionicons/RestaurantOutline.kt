package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.RestaurantOutline: ImageVector
    get() {
        if (_restaurantOutline != null) {
            return _restaurantOutline!!
        }
        _restaurantOutline = Builder(name = "RestaurantOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(57.49f, 47.74f)
                lineTo(425.92f, 416.17f)
                arcToRelative(37.28f, 37.28f, 0.0f, false, true, 0.0f, 52.72f)
                horizontalLineToRelative(0.0f)
                arcToRelative(37.29f, 37.29f, 0.0f, false, true, -52.72f, 0.0f)
                lineToRelative(-90.0f, -91.55f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 274.0f, 354.91f)
                verticalLineToRelative(-5.53f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -9.52f, -22.78f)
                lineToRelative(-11.62f, -10.73f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -29.8f, -7.44f)
                horizontalLineToRelative(0.0f)
                arcTo(48.53f, 48.53f, 0.0f, false, true, 176.5f, 295.8f)
                lineTo(91.07f, 210.36f)
                curveTo(40.39f, 159.68f, 21.74f, 83.15f, 57.49f, 47.74f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(400.0f, 32.0f)
                lineToRelative(-77.25f, 77.25f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 304.0f, 154.51f)
                verticalLineToRelative(14.86f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -4.69f, 11.32f)
                lineTo(288.0f, 192.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 224.0f)
                lineToRelative(11.31f, -11.31f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 342.63f, 208.0f)
                horizontalLineToRelative(14.86f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 45.26f, -18.75f)
                lineTo(480.0f, 112.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(440.0f, 72.0f)
                lineTo(360.0f, 152.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 368.0f)
                lineTo(100.28f, 468.28f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -56.56f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, -56.56f)
                lineTo(128.0f, 328.0f)
            }
        }
        .build()
        return _restaurantOutline!!
    }

private var _restaurantOutline: ImageVector? = null
