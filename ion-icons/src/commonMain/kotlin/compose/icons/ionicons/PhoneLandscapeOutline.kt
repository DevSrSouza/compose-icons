package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PhoneLandscapeOutline: ImageVector
    get() {
        if (_phoneLandscapeOutline != null) {
            return _phoneLandscapeOutline!!
        }
        _phoneLandscapeOutline = Builder(name = "PhoneLandscapeOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 336.0f)
                lineTo(16.0f, 176.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 64.0f, 128.0f)
                lineTo(448.0f, 128.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 496.0f, 176.0f)
                lineTo(496.0f, 336.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 448.0f, 384.0f)
                lineTo(64.0f, 384.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 16.0f, 336.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 336.0f)
                verticalLineTo(312.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(176.0f)
            }
        }
        .build()
        return _phoneLandscapeOutline!!
    }

private var _phoneLandscapeOutline: ImageVector? = null
