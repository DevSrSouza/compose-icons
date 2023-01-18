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

public val FilledGroup.EyeOff: ImageVector
    get() {
        if (_eyeOff != null) {
            return _eyeOff!!
        }
        _eyeOff = Builder(name = "EyeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.2197f, 2.2197f)
                curveTo(1.9534f, 2.4859f, 1.9292f, 2.9026f, 2.147f, 3.1962f)
                lineTo(2.2197f, 3.2803f)
                lineTo(6.2542f, 7.3149f)
                curveTo(4.3323f, 8.6644f, 2.8958f, 10.6799f, 2.2989f, 13.0644f)
                curveTo(2.1983f, 13.4662f, 2.4425f, 13.8735f, 2.8443f, 13.9741f)
                curveTo(3.2461f, 14.0746f, 3.6534f, 13.8305f, 3.754f, 13.4286f)
                curveTo(4.2835f, 11.3135f, 5.5911f, 9.5395f, 7.3342f, 8.3945f)
                lineTo(9.1438f, 10.2043f)
                curveTo(8.4363f, 10.9258f, 8.0f, 11.9143f, 8.0f, 13.0046f)
                curveTo(8.0f, 15.2138f, 9.7909f, 17.0046f, 12.0f, 17.0046f)
                curveTo(13.0904f, 17.0046f, 14.0788f, 16.5683f, 14.8004f, 15.8608f)
                lineTo(20.7197f, 21.7803f)
                curveTo(21.0126f, 22.0732f, 21.4874f, 22.0732f, 21.7803f, 21.7803f)
                curveTo(22.0466f, 21.5141f, 22.0708f, 21.0974f, 21.8529f, 20.8038f)
                lineTo(21.7803f, 20.7197f)
                lineTo(15.6668f, 14.6055f)
                lineTo(15.668f, 14.604f)
                lineTo(8.7188f, 7.6578f)
                lineTo(8.72f, 7.656f)
                lineTo(7.5867f, 6.5255f)
                lineTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                close()
                moveTo(12.0f, 5.5f)
                curveTo(10.9997f, 5.5f, 10.0291f, 5.6481f, 9.1111f, 5.925f)
                lineTo(10.3481f, 7.1612f)
                curveTo(10.8839f, 7.0553f, 11.4364f, 7.0f, 12.0f, 7.0f)
                curveTo(15.9231f, 7.0f, 19.3099f, 9.6803f, 20.2471f, 13.4332f)
                curveTo(20.3475f, 13.835f, 20.7546f, 14.0794f, 21.1565f, 13.9791f)
                curveTo(21.5584f, 13.8787f, 21.8028f, 13.4716f, 21.7024f, 13.0697f)
                curveTo(20.5994f, 8.6527f, 16.6155f, 5.5f, 12.0f, 5.5f)
                close()
                moveTo(12.1947f, 9.0093f)
                lineTo(15.996f, 12.81f)
                curveTo(15.8942f, 10.7531f, 14.2472f, 9.1076f, 12.1947f, 9.0093f)
                close()
            }
        }
        .build()
        return _eyeOff!!
    }

private var _eyeOff: ImageVector? = null
