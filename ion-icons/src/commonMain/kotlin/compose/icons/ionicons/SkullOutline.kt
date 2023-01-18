package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.SkullOutline: ImageVector
    get() {
        if (_skullOutline != null) {
            return _skullOutline!!
        }
        _skullOutline = Builder(name = "SkullOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 225.64f)
                verticalLineToRelative(99.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, -40.23f, 59.42f)
                lineToRelative(-23.68f, 9.47f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 364.6f, 417.0f)
                lineToRelative(-10.0f, 50.14f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 338.88f, 480.0f)
                horizontalLineTo(173.12f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.69f, -12.86f)
                lineTo(147.4f, 417.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -19.49f, -23.44f)
                lineToRelative(-23.68f, -9.47f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 64.0f, 324.67f)
                verticalLineTo(224.0f)
                curveTo(64.0f, 118.08f, 149.77f, 32.19f, 255.65f, 32.0f)
                reflectiveCurveTo(448.0f, 119.85f, 448.0f, 225.64f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(168.0f, 280.0f)
                moveToRelative(-40.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 80.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -80.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(344.0f, 280.0f)
                moveToRelative(-40.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 80.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -80.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 336.0f)
                lineToRelative(-16.0f, 48.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(-16.0f, -48.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 448.0f)
                lineTo(256.0f, 480.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 448.0f)
                lineTo(208.0f, 480.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(304.0f, 448.0f)
                lineTo(304.0f, 480.0f)
            }
        }
        .build()
        return _skullOutline!!
    }

private var _skullOutline: ImageVector? = null
