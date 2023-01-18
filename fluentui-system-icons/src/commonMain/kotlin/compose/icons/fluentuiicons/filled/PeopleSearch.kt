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

public val FilledGroup.PeopleSearch: ImageVector
    get() {
        if (_peopleSearch != null) {
            return _peopleSearch!!
        }
        _peopleSearch = Builder(name = "PeopleSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9092f, 13.9998f)
                lineTo(19.7531f, 14.0002f)
                curveTo(20.9957f, 14.0002f, 22.0031f, 15.0075f, 22.0031f, 16.2502f)
                verticalLineTo(17.1553f)
                curveTo(22.0031f, 18.2489f, 21.5256f, 19.2881f, 20.6958f, 20.0005f)
                curveTo(19.1303f, 21.3445f, 16.89f, 22.0013f, 14.0f, 22.0013f)
                lineTo(13.821f, 22.0002f)
                curveTo(14.1231f, 21.3917f, 14.0492f, 20.644f, 13.5995f, 20.1038f)
                lineTo(13.489f, 19.9829f)
                lineTo(11.2591f, 17.759f)
                curveTo(11.7394f, 16.9319f, 12.0f, 15.9854f, 12.0f, 15.0003f)
                curveTo(12.0f, 14.6586f, 11.9689f, 14.3242f, 11.9092f, 13.9998f)
                close()
                moveTo(6.5f, 10.5003f)
                curveTo(8.9853f, 10.5003f, 11.0f, 12.515f, 11.0f, 15.0003f)
                curveTo(11.0f, 16.0941f, 10.6097f, 17.0967f, 9.9609f, 17.8766f)
                lineTo(12.7827f, 20.6909f)
                curveTo(13.076f, 20.9834f, 13.0766f, 21.4583f, 12.784f, 21.7515f)
                curveTo(12.5181f, 22.0181f, 12.1014f, 22.0428f, 11.8076f, 21.8253f)
                lineTo(11.7234f, 21.7528f)
                lineTo(8.8202f, 18.8567f)
                curveTo(8.1427f, 19.2652f, 7.3488f, 19.5003f, 6.5f, 19.5003f)
                curveTo(4.0147f, 19.5003f, 2.0f, 17.4855f, 2.0f, 15.0003f)
                curveTo(2.0f, 12.515f, 4.0147f, 10.5003f, 6.5f, 10.5003f)
                close()
                moveTo(6.5f, 12.0003f)
                curveTo(4.8432f, 12.0003f, 3.5f, 13.3434f, 3.5f, 15.0003f)
                curveTo(3.5f, 16.6571f, 4.8432f, 18.0003f, 6.5f, 18.0003f)
                curveTo(8.1568f, 18.0003f, 9.5f, 16.6571f, 9.5f, 15.0003f)
                curveTo(9.5f, 13.3434f, 8.1568f, 12.0003f, 6.5f, 12.0003f)
                close()
                moveTo(14.0f, 2.0049f)
                curveTo(16.7614f, 2.0049f, 19.0f, 4.2435f, 19.0f, 7.0049f)
                curveTo(19.0f, 9.7663f, 16.7614f, 12.0049f, 14.0f, 12.0049f)
                curveTo(11.2386f, 12.0049f, 9.0f, 9.7663f, 9.0f, 7.0049f)
                curveTo(9.0f, 4.2435f, 11.2386f, 2.0049f, 14.0f, 2.0049f)
                close()
            }
        }
        .build()
        return _peopleSearch!!
    }

private var _peopleSearch: ImageVector? = null
