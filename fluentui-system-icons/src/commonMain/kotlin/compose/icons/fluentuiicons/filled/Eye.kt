package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9999f, 9.0046f)
                curveTo(14.209f, 9.0046f, 15.9999f, 10.7955f, 15.9999f, 13.0046f)
                curveTo(15.9999f, 15.2138f, 14.209f, 17.0046f, 11.9999f, 17.0046f)
                curveTo(9.7907f, 17.0046f, 7.9999f, 15.2138f, 7.9999f, 13.0046f)
                curveTo(7.9999f, 10.7955f, 9.7907f, 9.0046f, 11.9999f, 9.0046f)
                close()
                moveTo(11.9999f, 5.5f)
                curveTo(16.6134f, 5.5f, 20.596f, 8.65f, 21.701f, 13.0644f)
                curveTo(21.8016f, 13.4662f, 21.5574f, 13.8735f, 21.1556f, 13.9741f)
                curveTo(20.7537f, 14.0746f, 20.3465f, 13.8305f, 20.2459f, 13.4286f)
                curveTo(19.307f, 9.678f, 15.9212f, 7.0f, 11.9999f, 7.0f)
                curveTo(8.0768f, 7.0f, 4.69f, 9.6803f, 3.7527f, 13.4332f)
                curveTo(3.6524f, 13.835f, 3.2452f, 14.0794f, 2.8434f, 13.9791f)
                curveTo(2.4415f, 13.8787f, 2.1971f, 13.4716f, 2.2974f, 13.0697f)
                curveTo(3.4005f, 8.6527f, 7.3844f, 5.5f, 11.9999f, 5.5f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
