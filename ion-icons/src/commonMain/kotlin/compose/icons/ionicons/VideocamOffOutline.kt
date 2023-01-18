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

public val IonIcons.VideocamOffOutline: ImageVector
    get() {
        if (_videocamOffOutline != null) {
            return _videocamOffOutline!!
        }
        _videocamOffOutline = Builder(name = "VideocamOffOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(374.79f, 308.78f)
                lineTo(457.5f, 367.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 480.0f, 352.38f)
                verticalLineTo(159.62f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 457.5f, 145.0f)
                lineToRelative(-82.71f, 58.22f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 368.0f, 216.3f)
                verticalLineToRelative(79.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 374.79f, 308.78f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(50.19f, 140.57f)
                arcTo(51.94f, 51.94f, 0.0f, false, false, 32.0f, 180.0f)
                verticalLineTo(332.0f)
                arcToRelative(52.15f, 52.15f, 0.0f, false, false, 52.0f, 52.0f)
                horizontalLineTo(268.0f)
                arcToRelative(51.6f, 51.6f, 0.0f, false, false, 22.0f, -4.9f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 128.0f)
                horizontalLineToRelative(60.48f)
                arcTo(51.68f, 51.68f, 0.0f, false, true, 320.0f, 179.52f)
                verticalLineTo(248.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(416.0f, 416.0f)
                lineTo(80.0f, 80.0f)
            }
        }
        .build()
        return _videocamOffOutline!!
    }

private var _videocamOffOutline: ImageVector? = null
