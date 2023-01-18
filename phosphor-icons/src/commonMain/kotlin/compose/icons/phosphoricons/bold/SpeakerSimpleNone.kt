package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.SpeakerSimpleNone: ImageVector
    get() {
        if (_speakerSimpleNone != null) {
            return _speakerSimpleNone!!
        }
        _speakerSimpleNone = Builder(name = "SpeakerSimpleNone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 236.0f)
                arcToRelative(12.7f, 12.7f, 0.0f, false, true, -7.4f, -2.5f)
                lineTo(75.9f, 180.0f)
                horizontalLineTo(32.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineTo(96.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 32.0f, 76.0f)
                horizontalLineTo(75.9f)
                lineToRelative(68.7f, -53.5f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 12.7f, -1.3f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 32.0f)
                verticalLineTo(224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -6.7f, 10.8f)
                arcTo(12.4f, 12.4f, 0.0f, false, true, 152.0f, 236.0f)
                close()
                moveTo(36.0f, 156.0f)
                horizontalLineTo(80.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 7.4f, 2.5f)
                lineToRelative(52.6f, 41.0f)
                verticalLineTo(56.5f)
                lineToRelative(-52.6f, 41.0f)
                arcTo(12.2f, 12.2f, 0.0f, false, true, 80.0f, 100.0f)
                horizontalLineTo(36.0f)
                close()
            }
        }
        .build()
        return _speakerSimpleNone!!
    }

private var _speakerSimpleNone: ImageVector? = null
