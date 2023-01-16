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

public val MaterialDesignIcons.MusicAccidentalNatural: ImageVector
    get() {
        if (_musicAccidentalNatural != null) {
            return _musicAccidentalNatural!!
        }
        _musicAccidentalNatural = Builder(name = "MusicAccidentalNatural", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 8.75f)
                verticalLineTo(3.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.5f)
                lineTo(14.0f, 15.25f)
                verticalLineTo(20.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.5f)
                lineTo(10.0f, 8.75f)
                moveTo(14.0f, 13.25f)
                lineTo(10.0f, 14.75f)
                verticalLineTo(10.75f)
                lineTo(14.0f, 9.25f)
                verticalLineTo(13.25f)
                close()
            }
        }
        .build()
        return _musicAccidentalNatural!!
    }

private var _musicAccidentalNatural: ImageVector? = null
