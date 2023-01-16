package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.MusicNoteQuarterDotted: ImageVector
    get() {
        if (_musicNoteQuarterDotted != null) {
            return _musicNoteQuarterDotted!!
        }
        _musicNoteQuarterDotted = Builder(name = "MusicNoteQuarterDotted", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                verticalLineTo(13.56f)
                arcTo(3.96f, 3.96f, 0.0f, false, false, 10.0f, 13.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 14.0f, 17.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.0f)
                moveTo(16.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 15.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 17.0f)
                close()
            }
        }
        .build()
        return _musicNoteQuarterDotted!!
    }

private var _musicNoteQuarterDotted: ImageVector? = null
